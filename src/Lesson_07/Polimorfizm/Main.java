package Lesson_07.Polimorfizm;

public class Main {
    public static void main(String[] args) {

final int n=2;
Animal[] animals = new Animal[n];
animals[0] = new Cat("Vaska",3);
        animals[1] = new Dog("Muhtar",5);

        for (int i=0; i<n; i++ ){
           animals[i].info();
           animals[i].makeSaund();
        }
    }
}
