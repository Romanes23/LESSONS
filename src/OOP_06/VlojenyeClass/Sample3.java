package OOP_06.VlojenyeClass;
// Класс помещаем в метод
public class Sample3 {
    public static void main(String[] args) {
        Dogg d = new Dogg("Шарик");

        d.run_1();        //засада 1  2  3

    }
}

class Dogg{
    private String name;
                                         // 1

    public Dogg (String name) {
        this.name = name;
                                   //2
    }
    void run_1(){                                                 //3
        class Foott{
            void run_2(){
                String name ="Foot";
          //      System.out.println("Собака  " + name +" бежит");
                System.out.println("Собака  " + Dogg.this.name +" бежит");
            }
        }

        Foott foott = new Foott();
        System.out.println("Экземпляр класса foott  " );

        foott.run_2();
    }



}
