package OOP_06.Peregruz;

public class Sampl {
    public static void main(String[] args) {
//        Calculate K = new Calculate(5,10);
//        Calculate K1 = new Calculate(5,10,20);
        Calculate obj = new Calculate();
obj.Calculate(5,10);
        obj.Calculate(5,20);
        obj.Calculate(5.3,20.5);
    }
}

class Calculate {
//    public Calculate (int x, int y  ) {  System.out.println(x+y); }
//    public Calculate (int x, int y, int z) {  System.out.println(x+y+z); }

    public void Calculate (int x, int y  ) {  System.out.println(x+y); }
    public void Calculate (int x, int y, int z) {  System.out.println(x+y+z); }
    public void Calculate (double x, double y  ) {  System.out.println(x+y); }
}

