package Lesson_07.Abstract1;



public class Sqwer extends Shape{

    private int side;

    public Sqwer(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getAPermetr() {
        return side*4;
    }

    @Override
    public void info() {

        System.out.printf(  " ==== Квадрат=== %n   Side: %d%n  Цвет:  %s%n  Площадь %.1f%n  Периметр %.1f%n" ,side,getColor(), getArea(),getAPermetr());
        draw();
    }

    @Override
    public void draw() {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
