package Lesson_07.Polimorfizm;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void info() {
        System.out.printf("Я Собака. Меня зовут %s.  Мой возраст %d.%n" , getName(), getAge());
    }

    @Override
    public void makeSaund() {
        System.out.printf(" %s гавкает. %n" , getName());
    }
}
