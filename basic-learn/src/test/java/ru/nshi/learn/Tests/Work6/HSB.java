package ru.nshi.learn.Tests.Work6;

public class HSB
{
    public int hue, saturation, brightness;

    public HSB(int valueHue,int valueSaturation, int valueBrightness)
    {
        if(valueHue >= 0 && valueHue <= 360 && valueSaturation >= 0 && valueSaturation <= 100 && valueBrightness >= 0 && valueBrightness <= 100)
        {
            this.hue=valueHue;
            this.saturation=valueSaturation;
            this.brightness=valueBrightness;
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }
    public void setHSB(int valueHue,int valueSaturation,int valueBrightness)
    {
        if(valueHue >= 0 && valueHue <= 360)
        {
            this.hue=valueHue;
        }
        else
        {
            throw new IllegalArgumentException("значение "+valueHue+" не входит в диапазон 0-360");
        }
        if(valueSaturation >= 0 && valueSaturation <= 100)
        {
            this.saturation = valueSaturation;
        }
        else
        {
            throw new IllegalArgumentException("значение "+valueSaturation+" не входит в диапазон 0-100");
        }
        if(valueBrightness >= 0 && valueBrightness <= 100)
        {
            this.brightness=valueBrightness;
        }
        else
        {
            throw new IllegalArgumentException("значение "+valueBrightness+" не входит в диапазон 0-100");
        }
    }
    /*public void setHue(int value)
    {
        if(value >= 0 && value <= 360)
        {
            this.hue =value;
        }
        else
        {
            throw new IllegalArgumentException("значение "+value+" не входит в диапазон 0-360");
        }

    }
    public  void setSaturation(int value)
    {
        if(value >= 0 && value <= 100)
        {
            this.saturation = value;
        }
        else
        {
            throw new IllegalArgumentException("значение "+value+" не входит в диапазон 0-100");
        }
    }
    public  void setBrightness(int value )
    {
        if(value >= 0 && value <= 100)
        {
            this.brightness =value;
        }
        else
        {
            throw new IllegalArgumentException("значение "+value+" не входит в диапазон 0-100");
        }
    }*/
}
