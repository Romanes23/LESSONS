package Lesson_07.OgrDostupa;

public class Main {
    public static void main(String[] args) {

Rectangle rect= new Rectangle("Green",10,20);
//rect.setWidth(-5);
rect.setHeght(-120);
        System.out.println("Ширина " + rect.getWidth());
        System.out.println("Высота " + rect.getHeght());
        System.out.println("Цвет " + rect.getColor());
        System.out.println("Площадь " + rect.area());
    }
}
