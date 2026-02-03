package OOP_06.VlojenyeClass;

public class Sample {
    public static void main(String[] args) {

Outer out = new Outer("Vneshny");  System.out.println(out.name);


        System.out.println(Outer.Inner.age); // static, поэтому легко
        System.out.println(out.inn.innerName);   // засада 1 2 3 4

        Outer.Inner.Info(); // нет проблем, тк. статик
        out.inn.func();;
    }
}

class Outer{
    String name;
    Inner inn;                                     // 1.

    public Outer(String name) {
        this.name = name;
        inn = new Inner("Vnutrenniy");    // 2
    }



    class Inner{
        static int age;
        String innerName;

        static {age=18;}

        public Inner(String innerName) {            // 3
            this.innerName = innerName;
        }

        public static void Info() {
            System.out.println("Статический метод");
        }
        public void func() {
            System.out.printf("Метод во вложенном классе");
        }

    }



}

