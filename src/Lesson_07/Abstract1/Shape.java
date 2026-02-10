package Lesson_07.Abstract1;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();
    public abstract double getAPermetr();
    public abstract void info();
    public abstract void draw();
}
