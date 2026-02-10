package Lesson_08.Generics.Gener_5_interf;

public class Sample_5 {
    static void main(String[] args) {
        Point3<Float> pt = new Point3<>();
        pt.setCoor(10.02f,20.04f);
        System.out.println(pt.getCoor(TypeCoor.COOR_X));
        System.out.println(pt.getCoor(TypeCoor.COOR_Y));
    }
}

enum TypeCoor {
    COOR_X, COOR_Y;
}

interface GeomIn<T> {
    void setCoor(T x, T y);
    T getCoor(TypeCoor type);
}


    class Point3 <T> implements GeomIn<T>{
     private  T x,y;

    @Override
    public void setCoor(T x, T y) {
        this.x =x;
        this.y =y;
    }

    @Override
    public T getCoor(TypeCoor type) {
        return type == TypeCoor.COOR_X ? x : y;
    }


}