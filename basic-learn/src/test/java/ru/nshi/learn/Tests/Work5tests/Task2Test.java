package ru.nshi.learn.Tests.Work5tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.nshi.learn.Tests.Work3.w3Task1;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task2Test {//Двумерные массивы

    w3Task1 Work3task1;
    w3Task1 Work3task2;
    @BeforeEach
    void setUp() {
       Work3task1 = new w3Task1();
    }

    @Test
    void Work3Task1Check() {
         int[][] testArray = {{1, 1},{1, 1}};
         int [] sumArray= new int[2];
         Work3task1.Sum(testArray,sumArray);
         int[] actualSumArray={2, 2,};
         Work3task1.printSumArray(sumArray);
         assertTrue(actualSumArray[0]==sumArray[0]);
    }

    @Test
    void Work3Task2Check(){
        int[][] testArray = {{1, 1},{2, 1}};
        int [] sumArray= new int[2];
        Work3task2.Sum(testArray,sumArray);
        int[] actualSumArray={2, 3,};
        Work3task2.printSumArray(sumArray);
        assertTrue(actualSumArray[1]==sumArray[1]);
    }
}
