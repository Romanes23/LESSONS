package Lesson_08.Generics.Gener_7_Progr;

public class Circle extends Figure{
    private double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    @Override
    public double getArea() {
        return Math.PI*rad*rad;
    }
}