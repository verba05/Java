package com.something;

import java.util.Locale;

public class Style {
    final public String fillColor, strokeColor;
    final public double strokeWidth;
    public Style(){
        this.fillColor = "black";
        this.strokeColor = "black";
        this.strokeWidth = 1;
    }
    public Style(String fillColor, String strokeColor, double strokeWidth){
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
    }
    public String toSvg(){
        return String.format(Locale.ENGLISH,"fill:%s;stroke-width:%f",this.fillColor,this.strokeColor,this.strokeWidth);
    }
}
