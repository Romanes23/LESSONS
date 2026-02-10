package Lesson_07.Abstract1;

public class Triangle extends Shape {
    private int side;

    public Triangle(int side,String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3/4)*(2*2);
    }

    @Override
    public double getAPermetr() {
        return side*3;
    }

    @Override
    public void info() {
        System.out.printf(  " ==== Треуг=== %n   Side: %d%n  Цвет:  %s%n  Площадь %.1f%n  Периметр %.1f%n" ,side,getColor(), getArea(),getAPermetr());
        draw();
    }

    @Override
    public void draw() {
        for (int i = 0; i < side; i++) {
            for (int j = i; j < side; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
