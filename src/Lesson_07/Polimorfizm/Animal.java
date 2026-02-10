package Lesson_07.Polimorfizm;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void info(){
        System.out.println("Информация о животном");
    }
    public void makeSaund(){
        System.out.println("Что говорит животное");
    }
}
