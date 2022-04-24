package ru.nshi.learn.Tests.Work5tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.nshi.learn.Tests.Work4.*;

//import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {//Двумерные массивы

    w4Task1 Work4task1;
    w4Task2 Work4task2;
    w4Task3 Work4task3;
    w4Task4 Work4task4;
    w4Task5 Work4task5;
    w4Task6 Work4task6;
    w4Task7 Work4task7;

    @BeforeEach
    void setUp() {
       Work4task1 = new w4Task1();
       Work4task2 = new w4Task2();
       Work4task3 = new w4Task3();
       Work4task4 = new w4Task4();
       Work4task5 = new w4Task5();
       Work4task6 = new w4Task6();
       Work4task7 = new w4Task7();
    }

    @Test
    void Work4Task1Check() {
        String text = "qwer";
    Work4task1.sorting(text);
    assertTrue(!text.isEmpty());
    }
    @Test
    void Work4Task2Check()
    {
        String text="asdFghH";
        Work4task2.sorting(text);
        assertEquals(Work4task2.sorting(text), "FH");
    }

    @Test
    void Work4Task3Check()
    {
        String text = "qw3er1";
        char[] array = new char[Work4task3.scanning(text)];
        char[] actual = new char[]{'3','1'};
        assertEquals(Work4task3.sorting(text,array)[0], actual[0]);
    }
    @Test
    void Work4Task4Check()
    {
        String text = "qw3er1";
        int actual = 4;
        assertEquals(Work4task4.sorting(text), actual);
    }
    @Test
    void Work4Task5Check()
    {
        String text = "qqww3eeee";
        String actual= "qw3e";
        assertEquals(Work4task5.sorting(text), actual);
    }
    @Test
    void Work4Task6Check()
    {
        String[] text = {"qwert","qw"};
        String actual= "qwert";
        assertEquals(Work4task6.sorting(text),actual);
    }
    @Test
    void Work4Task7Check()
    {
        String text = "qwert qw rewq wwe";
        String[] array = new String[4];
        String actual= "qwert";
        Work4task7.enter(array, text);
        assertEquals(Work4task6.sorting(array),actual);
    }
}
