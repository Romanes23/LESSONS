package OOP_06;
import static java.lang.System.*; // 1 это статический импорт
public class Static {
    public static void main(String[] args) {
       Point P1 = new Point(5, 8);
       Point P2 = new Point(10, 12);
        System.out.println(Point.getCount());
        out.println(Point.getCount()); // 2 это статический импорт
    }
}

class Point {
    int x,y;
  private   static int count;
    static    { count =10;}  // без статик 11

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        count++;
    }

    public static int getCount(){
        return count;
    }

}