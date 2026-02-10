package Lesson_07.Abstract1_Interfase;

public class Base2 {
    static void main() {
        final int M=3;

//        Shape[] shapes = new Shape[M];
//        shapes[0] =new Line(20,"blue", 30,40,50,60);
//        shapes[1] =new Rectangle(15,"red",18,25);
//        shapes[2]= new Triangle(11,"orang",120,140);
//
//
//
//        ShapeInterfase[] sh = new ShapeInterfase[M];
//        sh[0] =new Line(20,"blue", 30,40,50,60);
//        sh[1] =new Rectangle(15,"red",18,25);
//        sh[2]= new Triangle(11,"orang",120,140);
//
//
//        for (int i=0;i< shapes.length;i++){
//            shapes[i].Drow();
//            if (shapes[i] instanceof MathShape){    //                        shapes[i].getSquare()
//                System.out.println(  " ==== Площадь === "+ ((MathShape) shapes[i]).getSquare() );
//            }
//            sh[i].info();
//        }

Line l =new Line(5,"green",1,2,3,4);
l.setCoord(50,60,70,35);
l.info();
        l.setCoord(-50,60,70,35); // вернулись прежние изза отриц знака
        l.info();

        GeomInterfase.showInterwal();
    }
}
interface GeomInterfase{
    int min_coords=10;  // на самом деле это public static final
    int max_coords =1000;

    static  void showInterwal(){  // если метод статический, то можно реализацию в интерфейсе
        System.out.println(  min_coords+ "=== "+max_coords );
    }


}

interface ShapeInterfase{
    void info();
}

interface MathShape{
    double getSquare();
}

abstract class Shape{
    private int width;
    private String color;

    public Shape(int width, String color) {
        this.width = width;
        this.color = color;
    }
    abstract void Drow();



}

class Rectangle extends Shape implements MathShape, ShapeInterfase {
    private int width;
    private int height;

    public Rectangle(int width, String color, int width1, int height) {
        super(width, color);
        this.width = width1;
        this.height = height;
    }

    @Override
    void Drow() {
        System.out.println(  " ==== Прямоугольник === " );
    }

    public  double getSquare(){
        return width*height;
    }

    @Override
    public void info() {
        System.out.println(  " ==== Прямоугольник === " + " Ширина " + width +" Высота "+ height);
    }
}


class  Triangle extends Shape implements MathShape, ShapeInterfase {
    private int length, height;

    public Triangle(int width, String color, int length, int height) {
        super(width, color);
        this.length = length;
        this.height = height;
    }

    @Override
    void Drow() {
        System.out.println(  " ==== Треугольник === " );
    }
    public   double getSquare(){
        return 0.5*length*height;
    }

    @Override
    public void info() {
        System.out.println(  " ==== Треугольник === " + " Длина " + length +" Высота "+ height);
    }
}

class Line extends Shape implements ShapeInterfase, GeomInterfase{
    private int x1,y1,x2,y2;

    public Line(int width, String color, int x1, int y1, int x2, int y2) {
        super(width, color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    void Drow() {
        System.out.println(  " ==== Линия === " );
    }


    private  boolean isCheck(int n){
        return    min_coords<=n && n<=max_coords;
    }

    void setCoord( int x1, int y1, int x2, int y2){
        if(isCheck(x1) &&isCheck(x2)&&isCheck(y1)&&isCheck(x1)){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;


        }

    }



    @Override
    public void info() {
        System.out.println(  " ==== Координаты === "  + x1+ "  "+ x2+ "  "+ y1+ "  "+ y2);
    }
}

