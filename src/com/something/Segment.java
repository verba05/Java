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
    static public Segment[] perpendicular(Segment segment, Point point){
        double a, b, x0, y0, x1, y1, x2, y2, sq, r;
        a = (segment.p1.y - segment.p2.y) / (segment.p1.x - segment.p2.x);
        b = point.y - a * point.x;
        x0 = point.x;
        y0 = point.y;
        r = segment.length();
        sq = Math.sqrt(-(y0*y0)+(2*a*x0+2*b)*y0-(a*a)*(x0*x0)-2*a*b*x0+(a*a+1)*r*r-b*b);
        x1 = (-(sq)-a*y0-x0+a*b)/(a*a+1);
        y1 = -(a*sq+a*a*y0+a*x0+b)/(a*a+1);
        x2 = (sq+a*y0+x0-a*b)/(a*a+1);
        y2 = (a*sq+a*a*y0+a*x0+b)/(a*a+1);
        return new Segment[]{new Segment(point,new Point(x1,y1)),new Segment(point,new Point(x2,y2))};

    }
}
