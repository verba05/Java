package com.something;

public class Segment {
    public Point p1, p2;
    public Segment() {
        p1 = new Point(0,0);
        p2 = new Point(0,0);
    }

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double length(){
        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    }

    public void print(){
        System.out.println(p1.x+","+p1.y+" "+p2.x+","+p2.y);
    }

    public String toSvg() {
        String str = ("<line x1=\"" + p1.x + "\" y1=\"" + p1.y + "\" x2=\"" + p2.x + "\" y2=\"" + p2.y + "\" stroke=\"black\" stroke-width=\"2\" />\n");
        return str;
    }
}
