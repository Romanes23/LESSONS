package Lesson_09.Anonimus;
// Делаем анонимный класс из обычного наследника
public class Main {
    static void main(String[] args) {
        int x =5;
        int y =3;
        Calc sum = new Calc();
        sum.Calculate(x,y);

        Calc mult = new Calc(){     // Анонимный класс это метод без создания самого класса. ТЕ созд объект ставим фиг скопки
            @Override               // и переопределяем в них метод
            public void Calculate(int a, int b) {
                System.out.println(a*b);
            } };
            mult.Calculate(x,y);


            //CalkNext mult =new CalkNext();
            //mult.Calculate(x,y);


    }
}

class Calc{
    int a,b;

    public void Calculate(int a, int b) {
        System.out.print(a+b);

    }
}

            //class CalkNext extends Calc{
            //    @Override
            //    public void Calculate(int a, int b) {
            //        System.out.println(a*b);
            //    }
            //}
