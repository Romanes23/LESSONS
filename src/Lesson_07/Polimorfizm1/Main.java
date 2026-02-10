package Lesson_07.Polimorfizm1;

public class Main {
    public static void main(String[] args) {

        SquareTable s= new SquareTable(10,20);
        s.calcArea();
        SquareTable s1= new SquareTable(20);
        s1.calcArea();
        RoaundTable s3 = new RoaundTable(50);
        s3.calcArea();

    }
}
