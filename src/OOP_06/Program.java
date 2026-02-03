package OOP_06;

public class Program {
    public static void main(String[] args) {
        Person pc = new Person(); pc.display();
        Person pc1 = new Person("Vasya"); pc1.display();
        Person pc2 = new Person( 120); pc2.display();
        Person pc3 = new Person("Vasya", 120); pc3.display();

        System.out.printf(pc3.getName());

    }
}

class Person    {  // класс без МД. тк есть МД у Program
    String name;
    int age;

    { name = "НЕИЗВЕСТНО";  age = 18; } // это инециализатор

    public String getName() {return name;} // геттеры
    public int getAge() {return age;}

    public void setName(String name) {this.name = name;} // сеттеры
    public void setAge(int age) { if(age<100) this.age =age; } // добавили условие в сеттер
    //    (age < 150) ? this.age = age :15 ; тернарный оператор здесь не работает

    public Person() {} // конструктор без параметров
    public Person(String name) { this.name = name; }
    public Person( int age) { this.age = age; }
    //public Person(String name, int age) { this.name = name; this.age = age; }
    public Person(String name, int age) { this.name = name; setAge(age);}// конструктор ч/з сеттер
    void display(){
     System.out.printf("Name:  %s\n Age: %d\n", name, age);
    }
}

// Ctrl+Insert  - создать гет, сет, констр