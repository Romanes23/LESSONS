package OOP_06.VlojenyeClass;
// Обращение из наружного к внутреннему
public class Sample1 {
    public static void main(String[] args) {
        Dog d = new Dog("Шарик");

           d.run_1();        //засада 1  2  3

    }
}

class Dog{
   private String name;
   private Foot foot;                                        // 1

    public Dog (String name) {
        this.name = name;
        foot = new Foot();                                    //2
    }
    void run_1(){                                                 //3
        foot.run_2();
}

    class Foot{
        void run_2(){
            System.out.println("Собака  " + name +" бежит");
        }
    }


}
