package com.something;

import java.util.Locale;

public class Polygon {
    private Point[] vertices;
    Style style;
    public Polygon(int numOfVer, Style style){
        vertices = new Point[numOfVer];
        this.style = style;
    }
    public void setVertex(int numOfVer, Point vertex){
        vertices[numOfVer] = vertex;
    }
    public void setVertices(Point[] vertices){
        this.vertices = vertices;
    }
    public String toSvg(){
        String s = "";
        for(Point p: vertices){
            s = s+p.x+","+p.y+" ";
        };
        return String.format(Locale.ENGLISH,"<polygon points=\"%s\" style=\"%s\"/>",s, style.toSvg());
    }
    public static Polygon square(Segment segment, Style style){
        Point p = new Point((segment.p1.x + segment.p2.x) / 2,(segment.p1.y + segment.p2.y) / 2);
        Segment segments[] = Segment.perpendicular(segment, p, segment.length()/2);

    }
}