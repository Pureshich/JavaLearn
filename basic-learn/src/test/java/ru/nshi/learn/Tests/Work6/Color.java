package ru.nshi.learn.Tests.Work6;

public class Color
{
    public int r,g,b;

    public Color(int valueR,int valueG, int valueB)
    {
        if(valueR >= 0 && valueR <= 255 && valueG >= 0 && valueG <= 255 && valueB >= 0 && valueB <= 255)
        {
            this.r=valueR;
            this.g=valueG;
            this.b=valueB;
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }
    public void setRGB(int valueR,int valueG,int valueB)
    {
        if(valueR >= 0 && valueR <= 255)
        {
            this.r=valueR;
        }
        else
        {
            throw new IllegalArgumentException("значение "+valueR+" не входит в диапазон 0-255");
        }
        if(valueG >= 0 && valueG <= 255)
        {
            this.g = valueG;
        }
        else
        {
            throw new IllegalArgumentException("значение "+valueG+" не входит в диапазон 0-255");
        }
        if(valueB >= 0 && valueB <= 255)
        {
            this.b=valueB;
        }
        else
        {
            throw new IllegalArgumentException("значение "+valueB+" не входит в диапазон 0-255");
        }
    }
}
