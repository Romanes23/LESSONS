package Lesson_08.Generics.Gener_1;

public class Sample2 {
    static void main(String[] args) {
        Point1 <Integer> pt = new Point1<>(1,30);
        double max = pt.getMax();

        System.out.print(max);
    }

    static class Point1<T extends Number>{
      public   T x,y;

        public Point1(T x, T y) {
            this.x = x;
            this.y = y;
        }

        public  T getMax(){
        double Xd =  x.doubleValue();
        double Yd = y.doubleValue();
        return Xd>Yd?x:y;
        }

    }



}
