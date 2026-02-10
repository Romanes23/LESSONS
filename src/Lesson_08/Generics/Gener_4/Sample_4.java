package Lesson_08.Generics.Gener_4;

public class Sample_4 {
    static void main(String[] args) {
        Short arr[] = {1, 2, 3, 4};
        Short val = 110;
        boolean flIn = Math.isIn(val, arr);
        System.out.print(flIn);


    }
}


class Math {
    public static <T> boolean isIn(T val, T[] arr) {
        for (T v : arr) {
            if (v.equals(val)) {
                return true;
            }
        }
        return false;
    }
}