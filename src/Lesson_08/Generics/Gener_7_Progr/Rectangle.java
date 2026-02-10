package Lesson_08.Generics.Gener_7_Progr;

class Rectangle extends Figure{
    private double width,height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }
}