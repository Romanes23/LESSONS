package Lesson_07.Polimorfizm1;

public class RoaundTable extends Table{

    public RoaundTable(double radius) {
        super(radius);
    }

    @Override
    public void calcArea() {
        System.out.printf(" Радиус %.0f%n  Площадь %.2f%n " , getRadius(), Math.PI* Math.pow(getRadius(),2));
    }
    }

//System.out.printf(" Радиус %.f%n  Площадь %.2f%n " , getRadius(), Math.PI* Math.pow(getRadius(),2));