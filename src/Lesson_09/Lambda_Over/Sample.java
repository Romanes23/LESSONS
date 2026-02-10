package Lesson_09.Lambda_Over;
interface Calc{
    public int calculate ();
}



public class Sample {
//    static int x= 100;
//    static int y =200;

    static void main(String[] args) {
        int x= 100;
        int y =200;
Calc calc = () -> {return x+y;};
System.out.println(x);
        System.out.println(calc.calculate());
    }
}
