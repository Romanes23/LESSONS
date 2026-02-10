package Lesson_07.Polimorfizm;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void info() {
       System.out.printf("Я Кот. Меня зовут %s.  Мой возраст %d.%n" , getName(), getAge());
    }

    @Override
    public void makeSaund() {
        System.out.printf(" %s мяукает. %n" , getName());
    }
}
