package ru.nshi.learn.Tests.Work6;

public class Triangle
{
    private float a,b,c;
    private double Square;

    public ru.nshi.learn.Tests.Work6.Color color=new Color(0,0,0);
    public ru.nshi.learn.Tests.Work6.HSB hsb=new HSB(0,100,100);

    public Triangle(float a,float b, float c)
    {
        if(a + b > c && a + c > b && b + c > a)
        {
            if(a > 0 && b > 0 && c > 0)
            {
                this.a = a;
                this.b = b;
                this.c = c;
            }
            else
            {
                throw new IllegalArgumentException("такого треугольника не существует");
            }
        }
        else
        {
            throw new IllegalArgumentException("такого треугольника не существует");
        }
        double p =(a+b+c)/2;
        Square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public double getSquare()
    {
        return Square;
    }

    public float[] getSideLength()
    {
        float[]sides={a,b,c};
        return sides;
    }

    public String info()
    {
        return "обьект: "+getClass().getSimpleName()+"\nдлина сторон: "+getSideLength()[0]+", "+getSideLength()[1]+", "+getSideLength()[2]+"\nплощадь:"+getSquare()+"\nцвет: "
            +"\nRGB[" +color.r+"|"+color.g+"|"+color.b+"]"+"\nHSB["+hsb.hue+"|"+hsb.brightness+"|"+hsb.saturation+"]\n";
    }

}
