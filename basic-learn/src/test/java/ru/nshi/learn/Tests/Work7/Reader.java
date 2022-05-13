package ru.nshi.learn.Tests.Work7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

public class Reader
{
    static String URL="https://raw.githubusercontent.com/rassafel/java-learn/master/tasks/data/CAR_DATA.csv" ;
    static Map<String, Integer> HEADERS = new HashMap<>();
    static Map<String, Integer> CARS = new HashMap<>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = getReader();
        HEADERS = readHeaders(reader);
        CARS= read(reader);
        System.out.println(HEADERS);
        System.out.println(CARS);

    }

    public static Map<String, Integer> readHeaders(BufferedReader reader) throws IOException {
        Map<String, Integer> headers = new HashMap<>();
        String header = reader.readLine();
        String[] headersArray = header.split(",");

        for (int i = 0; i < headersArray.length; i++) {
            headers.put(headersArray[i], i);
        }
        return headers;
    }
    public static Map<String,Integer> read(BufferedReader reader) throws IOException
    {
        //Map<String, Integer> CARS = new HashMap<>();
        String cars = reader.readLine();
        String[] headersArray = cars.split(",");

        for (int i = 0; i < headersArray.length; i++) {
            CARS.put(headersArray[i], i);
        }
        return CARS;
    }

    private static BufferedReader getReader() throws IOException
    {
        URL url = new URL(Reader.URL);
        URLConnection connection = url.openConnection();
        return new BufferedReader(new InputStreamReader(connection.getInputStream()));
    }
}
