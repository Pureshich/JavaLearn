package ru.nshi.learn.Tests.Work5tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.nshi.learn.Tests.Work3.*;

import static org.junit.jupiter.api.Assertions.*;

public class Task2Test //Двумерные массивы
{

    w3Task1 Work3task1;
    w3Task2 Work3task2;
    @BeforeEach
    void setUp() {
       Work3task1 = new w3Task1();
       Work3task2 = new w3Task2();
    }

    @Test
    void Work3Task1Check() {
         int[][] testArray = {{1, 2},{1, 7}};
         int [] sumArray= new int[2];
         Work3task1.Sum(testArray,sumArray);
         int[] actualSumArray={3, 8};
         Work3task1.printSumArray(sumArray);
        assertArrayEquals(actualSumArray,sumArray);
    }

    @Test
    void Work3Task2Check(){
        int[][] testArray = {{1, 1},{2, 1}};
        int [] resultArray= new int[2];
        Work3task2.SumColumns(testArray,resultArray);
        int[] actual={3, 2};
        Work3task2.printResultArray(resultArray);
        assertArrayEquals(actual,resultArray);
    }
}
