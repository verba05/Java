import com.something.*;

public class Main {
    public static void main(String[] args) {
        Point c = new Point(2,-2);
        Point d = new Point(2,-6);
        Segment a = new Segment(c,d);
        Segment b = new Segment(new Point(), new Point(1,0));
        Segment[] arr = perpendicularLines(a, new Point(0,0));
        arr[0].print();
    }
}