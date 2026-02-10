package Lesson_08.Generics.Gener;

public class Sample {
    static void main(String[] args) {
        Point <Integer, String> pt = new Point<>(10,20, "Point_1");
        System.out.println(pt.getX() +"   "+ pt.getY());

        Point <Double,Integer> pt2 = new Point<>(10.25,20.58,1);
        System.out.println(pt2.getX() +"   "+ pt2.getY());
    }



                    static class Point<T, V> {
                        private V id;
                        private T x, y;

                        private Point(T x, T y, V id) {
                            this.x = x;
                            this.y = y;
                            this.id =id;
                        }

                        public T getX() {return x;}
                        public T getY() {return y;}
                        public V getId() {return id;}
                    }


}




