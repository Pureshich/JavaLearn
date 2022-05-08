package ru.nshi.learn.Tests.Work6test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.nshi.learn.Work6.*;

public class Task1Test
{
    @Test
    void squareCheck()
    {
        Rectangle square = new Rectangle(3,3);
        square.color=new Color(0,150,255);
        square.hsb = new HSB(360,100,0);
        square.color.setRGB(12,87,0);
        System.out.println(square.info());
    }
    @Test
    void rectangleCheck()
    {
        Rectangle rectangle = new Rectangle(4,3);
        rectangle.color=new Color(0,150,255);
        rectangle.hsb=new HSB(360,100,100);
        System.out.println(rectangle.info());
    }
    @Test
    void circleCheck()
    {
        Circle circle = new Circle(2.5f);
        circle.color=new Color(0,150,255);
        circle.hsb=new HSB(360,100,100);
        System.out.println(circle.info());
    }
    @Test
    void triangleCheck()
    {
        Triangle triangle = new Triangle(3,4,5);
        triangle.color=new Color(0,150,255);
        triangle.hsb=new HSB(360,100,100);
        System.out.println(triangle.info());
    }
}
