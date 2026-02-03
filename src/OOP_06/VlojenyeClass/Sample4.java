package OOP_06.VlojenyeClass;

public class Sample4 {
    public static void main(String[] args) {
        Sample4 obj = new Sample4();
        obj.print();
    }

    private int outer_x =100;

    void print(){
        Inner inner =new Inner();
        inner.innerMethod();

    }

class Inner{
    public void innerMethod() {
        System.out.println(outer_x );
    }
}



}
