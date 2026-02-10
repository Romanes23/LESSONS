package Lesson_08.Generics.Gener_2;



public class Sample_3 {
    static void main(String[] args) {
        Point2<Integer> pt = new Point2<>(1,30);
        Point2<Double> pt2 = new Point2<>(10.25,5.128);
System.out.print(pt.eqalsPoint(pt2));
    }

    static class Point2<T extends Number>{
        public   T x,y;

        public Point2(T x, T y) {
            this.x = x;
            this.y = y;
        }

        public boolean eqalsPoint (Point2 <?> pt){
        return x.doubleValue()==pt.x.doubleValue() && y.doubleValue()==pt.y.doubleValue();
        }

    }



}
