package Lesson_08.Generics.Gener_7_Progr;

public class Main {
    static void main(String[] args) {
        Rectangle[] arr1 = new Rectangle[3];
        arr1[0]=new Rectangle(5,1);
        arr1[1]=new Rectangle(10,10);
        arr1[2]=new Rectangle(20,20);

        FigurStates<Rectangle> rs = new FigurStates<>(arr1);

System.out.println(rs.getSumArea()+"\n"+rs.getMaxSumArea()+"\n"+rs.getMinSumArea());


        Circle[] arr2 = new Circle[5];
        arr2[0]=new Circle(15);
        arr2[1]=new Circle(7);
        arr2[2]=new Circle(5);
        arr2[3]=new Circle(11);
        arr2[4]=new Circle(4);

        FigurStates<Circle> rs1 = new FigurStates<>(arr2);
        System.out.println(rs1.getSumArea()+"\n"+rs1.getMaxSumArea()+"\n"+rs1.getMinSumArea());
   }
}
