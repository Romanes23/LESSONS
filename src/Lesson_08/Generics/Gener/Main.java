package Lesson_08.Generics.Gener;

public class Main {
    static void main() {

        Integer[] ArrayInteger = {10,20,30,40};
        Double[] DoubleArray = {10.2,11.3,25.18};
        Character[] CharArray =  {'A','D','H','F','k'};

        print(ArrayInteger);
        print(DoubleArray);
        print(CharArray);
    }

        public static <T> void print(T[] ZnachMassiv ){
        for (T i: ZnachMassiv){
            System.out.printf( "%s  ",i);
        }
            System.out.println();
        }
}
