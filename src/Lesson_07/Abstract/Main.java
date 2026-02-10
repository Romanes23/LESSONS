package Lesson_07.Abstract;

public class Main {
    public static void main(String[] args) {
Dog dog =new Dog("Muhtar");
dog.makeSaund1();
dog.sleep();
    }
}


abstract class Animal{ // абстрактный класс если есть хоть один абстрактный метод
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void  makeSaund1();

    public void sleep(){
        System.out.println(name +"  спит");
    }
}

class Dog extends Animal {// обязательно 1. Имплемент метод 2. Конструктор
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSaund1() {
        System.out.println(getName() +"  Гавкает");
    }
}



