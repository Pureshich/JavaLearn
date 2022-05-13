package ru.nshi.learn.Tests.Work6test;

import org.junit.jupiter.api.Test;
import ru.nshi.learn.Tests.Work6.HSB;

public class Task1Test
{
    @Test
    void squareCheck()
    {
        ru.nshi.learn.Tests.Work6.Rectangle square = new ru.nshi.learn.Tests.Work6.Rectangle(3,3);
        square.color=new ru.nshi.learn.Tests.Work6.Color(0,150,255);
        square.hsb = new ru.nshi.learn.Tests.Work6.HSB(360,100,0);
        square.color.setRGB(12,87,0);
        System.out.println(square.info());
    }
    @Test
    void rectangleCheck()
    {
        ru.nshi.learn.Tests.Work6.Rectangle rectangle = new ru.nshi.learn.Tests.Work6.Rectangle(4,3);
        rectangle.color=new ru.nshi.learn.Tests.Work6.Color(0,150,255);
        rectangle.hsb=new ru.nshi.learn.Tests.Work6.HSB(360,100,100);
        System.out.println(rectangle.info());
    }
    @Test
    void circleCheck()
    {
        ru.nshi.learn.Tests.Work6.Circle circle = new ru.nshi.learn.Tests.Work6.Circle(2.5f);
        circle.color=new ru.nshi.learn.Tests.Work6.Color(0,150,255);
        circle.hsb=new ru.nshi.learn.Tests.Work6.HSB(360,100,100);
        System.out.println(circle.info());
    }
    @Test
    void triangleCheck()
    {
        ru.nshi.learn.Tests.Work6.Triangle triangle = new ru.nshi.learn.Tests.Work6.Triangle(3,4,5);
        triangle.color=new ru.nshi.learn.Tests.Work6.Color(0,150,255);
        triangle.hsb=new HSB(360,100,100);
        System.out.println(triangle.info());
    }
}
