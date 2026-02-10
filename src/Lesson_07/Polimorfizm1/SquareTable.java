package Lesson_07.Polimorfizm1;

public class SquareTable extends Table{

    public SquareTable(int width, int height) {
        super(width, height);
    }

    public SquareTable(int width) {
        super(width);
    }

    @Override
    public void calcArea() {
        System.out.printf(" Ширина %d%n  Высота %d%n Площадь %d%n" , getWidth(), getHeight(), getWidth()* getHeight());
    }
}

