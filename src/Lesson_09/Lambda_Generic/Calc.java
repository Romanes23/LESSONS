package Lesson_09.Lambda_Generic;
interface Calculate<T>{
    T calculate (T x, T y);
}
public class Calc {
    static void main(String[] args) {
        Calculate<Integer> cal = (x, y)->x+y;
        Calculate<String> cal2 = (x, y)->x+y;
        System.out.println(cal.calculate( 20,50));
        System.out.println(cal2.calculate( "Hello","Word"));


    }




}
