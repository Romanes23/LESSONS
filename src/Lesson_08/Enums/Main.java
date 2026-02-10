package Lesson_08.Enums;
enum Seasons{  // По сути обычный класс, с заранее созданными объектами и свойствами
    SPRING("Весна", 1),
    SUMMER("Лето", 2),
    AUTUMN("Зима", 3 ),
    WINTER("Осень", 4);

    // Объявляем свойства
    private String tile;
    int number;

    // это обычный конструктор класса
    Seasons (String tile, int number){ this.tile= tile; this.number=number;}

    @Override  // переопределили хэш то стринг
     public String toString() {return  tile + "  " + number; }

}

public class Main {
    static void main() {
       for (Seasons s: Seasons.values()) {
        System.out.println(s);}
    }
}
