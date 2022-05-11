package ru.nshi.learn.Tests.Work5tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.nshi.learn.Tests.Work1.Task1;
import ru.nshi.learn.Tests.Work1.Task3;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task1Test //ветления и циклы
{
    Task1 Work1task1;
    Task3 Work1task3;
    @BeforeEach
    void setUp() {
       Work1task1 = new Task1();
       Work1task3 = new Task3();
    }

    @Test
    void Work1Task1Check() {
       boolean actual = Work1task1.NumberCheck(123321);
        assertTrue(actual);

    }

    @Test
    void Work1Task3Check() {
        boolean actual = Work1task3.intCheck(3,false);
        assertTrue(actual);
        actual =Work1task3.intCheck(3,false);
        assertTrue(actual);
    }

}
