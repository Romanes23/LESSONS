package Lesson_09.Lambda_Expression;
interface CalcInterfase{
    public int calculate (int a, int b);
}


public class Sample {
    static void main(String[] args) {
int a =10;
int b =20;
CalcInterfase calc = (x,y) -> a+b; // return
        CalcInterfase dif = (x,y) -> a-b;
        CalcInterfase mult = (x,y) -> a*b;

        System.out.print(calc.calculate(a,b));
        System.out.print(dif.calculate(a,b));
        System.out.print(mult.calculate(a,b));
    }
}
