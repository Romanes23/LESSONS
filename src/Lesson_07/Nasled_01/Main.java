package Lesson_07.Nasled_01;


public class Main {
    public static void main(String[] args) {
        Line l1 = new Line(5, "red",0,0,10,10);
//        l1.color = "red";
//        l1.width = 5;
//        l1.x1 = l1.x2 = 0;
//        l1.x2 = l1.y2 = 10;
 //       l1.showProp();
        l1.show();
        l1.showId();
    }
}

class Properties {    //параметры линий - толщина и цвет
    int width;
    String color;
int id =1;
    public Properties() {
        System.out.println("Конструктор Properties без параметров" );}

    public Properties(int width, String color) {
        this.width = width;
        this.color = color;
    }

    void show() {
        System.out.println("Ширина  " + width + " Цвет " + color);
    }
}

class Line extends Properties {
    double x1, y1, x2, y2;
int id =5;
    public Line( int width, String color) {
       Super( width,  color);
       System.out.println("Конструктор Line " );}

    public Line(int width, String color, double x1, double y1, double x2, double y2) {
        super(width, color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    private void Super(int width, String color) {
    }

@Override
    void show() {
       super.show();
        System.out.println("Координаты линиии  Х1 " + x1 + " У1 " + y1 + " Х2 " + x2 + " У2 " + y2);
    }

    void showId(){
        System.out.println("id = " + this.id+ ";   SUPER id = " + super.id);
    }
}

class Triangle extends Properties {
    double x1, y1, z1, x2, y2, z2;

}