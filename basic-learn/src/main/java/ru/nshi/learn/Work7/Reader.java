package ru.nshi.learn.Work7;
import java.util.*;
import java.io.*;
import java.net.*;
import java.util.stream.*;

public class Reader
{
    private static final String folderPach = "basic-learn\\src\\main\\java\\ru\\nshi\\learn\\Work7\\resultFiles\\";
    static String URL="https://raw.githubusercontent.com/rassafel/java-learn/master/tasks/data/CAR_DATA.csv" ;
    static Map<String, Integer> HEADERS = new HashMap<>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = getReader();
        HEADERS = readHeaders(reader);
        System.out.println(HEADERS);

        Car[] cars = StringToCars(reader);//(5)
        carsResultFile(cars);//(5)

        Map<String, List<Car>> sortingByColor = groupingByColor(cars);//(6)
        colorSortingResultFile(sortingByColor);//(6)

        Map<CarMaker, List<Car>> mapByCarMaker = gropingByCarMaker(cars);//(7)
        List<CarMaker> carMakersList = new ArrayList<>(mapByCarMaker.keySet());//(7)
        listSortingFile(carMakersList);//(7)
        carMakersList.forEach( carMake -> System.out.println(carMake.getCars()));//(7)

        List<CarMaker> sortMakers = carMakersList.stream()
            .filter(Cmaker -> Cmaker.getCars().size() > 2)
            .sorted(Comparator.comparing(Cmaker -> Cmaker.getCarMakerName()))
            .collect(Collectors.toList());
        carSortingFile(sortMakers);
    }
    private static BufferedReader getReader() throws IOException {
        URL url = new URL(Reader.URL);
        URLConnection connection = url.openConnection();
        return new BufferedReader(new InputStreamReader(connection.getInputStream()));
    }

    public  static Map<String, Integer> readHeaders(BufferedReader reader) throws IOException {
        Map<String, Integer> headers = new HashMap<>();
        String header = reader.readLine();
        String[] headersArray = header.split(",");

        for (int i = 0; i < headersArray.length; i++) {
            headers.put(headersArray[i], i);
        }
        return headers;
    }

    private static Car[] StringToCars(BufferedReader reader) {
        Stream<String> lines = reader.lines();
        Car[] cars;
        cars = lines
            .map(Car::stringToCar)
            .toArray(Car[]::new);
        return cars;
    }

    private static Map<String, List<Car>> groupingByColor(Car[] cars) {
        return Arrays.stream(cars).collect(Collectors.groupingBy(Car::getColor));
    }
    private static Map<CarMaker,List<Car>> gropingByCarMaker(Car[] cars) {

        return Arrays.stream(cars).collect(Collectors.groupingBy(Car::getCarMaker));
    }
    private static void carsResultFile(Car[] cars)//выводим cars в файл(5)
    {
        try (FileWriter fw = new FileWriter(folderPach+"Cars(5).txt")) {
            for (Car car: cars)
            {
                fw.append(car.toString() + '\n');
            }
        } catch (IOException exc) {
            System.out.println(exc);
        }
    }
    private static void colorSortingResultFile(Map<String, List<Car>> sortingByColor)//выводим отсортированные по цветам в файл(6)
    {
        try (FileWriter fw = new FileWriter(folderPach+"SortingByColor(6).txt")) {

            for (Map.Entry<String, List<Car>> entry :sortingByColor.entrySet() )

                fw.append(entry.toString()+'\n');
        } catch (IOException exc) {
            System.out.println(exc);
        }
    }
    private  static  void listSortingFile(List<CarMaker> carMakersList)//выводим производителей в файл (7)
    {
        try (FileWriter fw = new FileWriter(folderPach+"CarMaker(7).txt")) {
            String chString = Stream.of(carMakersList)
                .map(arr -> new String(arr.toString()))
                .collect(Collectors.joining());
                fw.append(chString + '\n');
        } catch (IOException exc) {
            System.out.println(exc);
        }
    }

    private static void carSortingFile(List <CarMaker> elemets)
    {
        try (FileWriter fw = new FileWriter(folderPach+"CarSorting(8).txt")) {
            for (CarMaker maker : elemets)
                fw.append(maker.getCarMakerName() + '\n');
        } catch (IOException exc) {
            System.out.println(exc);
        }
    }
}
