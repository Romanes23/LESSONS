package Lesson_09.Lambda_Terminalnay;

interface Printable {
    void print(String s);
    // void print();    // 1 если принимаемых значений нет
}

public class Sample {
    static void main(String[] args) {
        Printable p = s -> System.out.println(s);// Терминальное лямбда-выражение
        //  Printable p =() -> System.out.println("Hello"); // 2 если принимаемых значений нет
        p.print("Hello");
        //    p.print();     // 3 если принимаемых значений нет
    }
}
