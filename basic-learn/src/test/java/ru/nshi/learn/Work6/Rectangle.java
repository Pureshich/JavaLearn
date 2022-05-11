package ru.nshi.learn.Work6;

public class Rectangle
{
    private float a,b,Square;
    private String name ="Rectangle";

    public Color color=new Color(0,0,0);
    public HSB hsb=new HSB(0,100,100);

    public Rectangle(float a,float b)
    {
        if(a > 0) {
            this.a = a;
        }
        else {
            throw new IllegalArgumentException(a+" <= 0");
        }
        if(b > 0) {
            this.b = b;
        }
        else {
            throw new IllegalArgumentException(b+" <= 0");
        }
        if(a == b)
        {
            name="Square";
        }
        this.Square=a * b;
    }
    public float getSquare()
    {
        return Square;
    }
    public float[] getSideLength()
    {
        float[]sides={a,b};
        return sides;
    }
    public String info()
    {
        return "обьект: "+name+"\nдлина сторон: "+getSideLength()[0]+", "+getSideLength()[1]+"\nплощадь:"+getSquare()+"\nцвет: "
            +"\nRGB[" +color.r+"|"+color.g+"|"+color.b+"]"+"\nHSB["+hsb.hue+"|"+hsb.brightness+"|"+hsb.saturation+"]\n";
    }
}
