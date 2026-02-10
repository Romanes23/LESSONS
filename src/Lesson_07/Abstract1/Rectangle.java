package Lesson_07.Abstract1;

public class Rectangle extends Shape{
    private int width;
    private int height;


    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getAPermetr() {
        return (height+width)*2;
    }

    @Override
    public void info() {
        System.out.printf(  " ==== Прямоугольник === %n   Ширина: %d%n Высота: %d%n  Цвет:  %s%n  Площадь %.1f%n  Периметр %.1f%n" ,width,height,   getColor(), getArea(),getAPermetr());
        draw();
    }

    @Override
    public void draw() {

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();


        }

    }
}
