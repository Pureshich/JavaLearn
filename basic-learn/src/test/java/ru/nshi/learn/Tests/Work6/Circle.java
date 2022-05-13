package ru.nshi.learn.Tests.Work6;

public class Circle
{
    private float r,Square;
    public ru.nshi.learn.Tests.Work6.Color color=new Color(0,0,0);
    public ru.nshi.learn.Tests.Work6.HSB hsb=new HSB(0,100,100);

    public Circle(float radius)
    {
        if(radius > 0) {
            this.r=radius;
        }
        else {
            throw new IllegalArgumentException(r+" <= 0");
        }
        Square=3.14f*r*r;
    }
    public float getSquare()
    {
        return Square;
    }
    public float getRadius()
    {
        return r;
    }
    public String info()
    {
        return "обьект: "+getClass().getSimpleName()+"\nрадиус: "+getRadius()+"\nплощадь:"+getSquare()+"\nцвет: "
            +"\nRGB[" +color.r+"|"+color.g+"|"+color.b+"]"+"\nHSB["+hsb.hue+"|"+hsb.brightness+"|"+hsb.saturation+"]\n";
    }
}
