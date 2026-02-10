package Lesson_07.OgrDostupa;

public class Rectangle extends Figura {
    private int width;
    private  int heght;
    public Rectangle(String color, int width, int heght) {
        super(color);
//        this.width = width;
//        this.heght = heght;
        setHeght(heght);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width<=0)
            throw new IllegalArgumentException( "ДБ положит значение");
        this.width = width;
    }

    public double getHeght() {
        return heght;
    }

    public void setHeght(int heght) {
        if (heght>0) this.heght = heght;
    }
    public int area () {
        return(width*heght);
    }

}
