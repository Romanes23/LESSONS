package OOP_06.Rect;

public class Main {
    public static void main(String[] args) {

        Rectangl rect1= new Rectangl(10,50);
        System.out.println("Длина  "+ rect1.lenght);
        System.out.println("Ширина  "+ rect1.width);
        System.out.println("Площадь  "+ rect1.getSQ());
        System.out.printf("Гиппотенуза  %.2f%n", rect1.getGipotenuse());
        rect1.drow();
    }
}
