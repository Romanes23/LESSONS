package Lesson_07.Abstract1;

public class Main {
    public static void main(String[] args) {
        final int n =3;
        Shape[] shapes = new Shape[n];
        shapes[0]  =new Sqwer(3,"red");
        shapes[1]  =new Rectangle(7,3,"blue");
        shapes[2]  =new Triangle(5,"yellow");

       for (Shape s: shapes){
           s.info();
       }


    }
}
