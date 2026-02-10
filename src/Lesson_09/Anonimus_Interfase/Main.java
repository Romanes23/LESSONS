package Lesson_09.Anonimus_Interfase;
// Функциональный интерфейс это когда только один в нем метод

interface CalkInterfase{
    void  Calculate(int a, int b);
}
public class Main {
    static void main(String[] args) {
        int x =5;
        int y =3;


        CalkInterfase mult = (a, b) -> System.out.print(a*b); // Это тот же самый анонимный класс или метод
//        CalkInterfase mult = new CalkInterfase() {                  // Сам по себе он не используется
//            @Override                                               // только когда имплемент => анонимный метод => лямбда
//            public void Calculate(int a, int b) {
//                System.out.print(a*b);
//            }
//        };
       mult.Calculate(x,y);

        Calc sum = new Calc();
        sum.Calculate(x,y);
    }
}



class Calc implements CalkInterfase{
    int a,b;

    public void Calculate(int a, int b) {
        System.out.print(a+b);

    }
}

