package Lesson_07.Nasled_02;

public class Human {
String lastname;
String firstname;
int age;

//    public Human() {
//    }

    public Human(String lastname, String firstname, int age) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        System.out.println("Constructor HUMAN hashcode " + Integer.toHexString(hashCode()));
    }
    public Human(Human other) {    // 2 Это конструктор копирования, дальше в Student
        this.lastname = other.lastname;
        this.firstname = other.firstname;
        this.age = other.age;
        System.out.println("Constructor HUMAN COPY hashcode " + Integer.toHexString(hashCode()));
    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", age=" + age +
                '}';
    }
}
