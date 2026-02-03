package OOP_06.VlojenyeClass;
// Обращение из внутреннего к наружному
public class Sample2 {
    public static void main(String[] args) {
        Dog_ d = new Dog_("Шарик");

        d.run_1();        //засада 1  2  3

    }
}

class Dog_{
    private String name;
    private Foot_ foot;                                        // 1

    public Dog_ (String name) {
        this.name = name;
        foot = new Foot_();                                    //2
    }
    void run_1(){                                                 //3

        foot.run_2();
    }

    class Foot_{
        void run_2(){
            String name ="Foot";
            System.out.println("Собака  " + name +" бежит");
            System.out.println("Собака  " + Dog_.this.name +" бежит");
        }
    }


}
