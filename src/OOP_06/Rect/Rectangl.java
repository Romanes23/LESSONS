package OOP_06.Rect;

public class Rectangl {
    int width;
    int lenght;


    public Rectangl(int width, int lenght) {
       setWidth(width);
       setLenght(lenght);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width>0)  this.width = width;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        if (lenght>0)this.lenght = lenght;
    }

    public int getSQ(){ return  width*lenght;}

    public double getGipotenuse(){
        return Math.sqrt(Math.pow(lenght,2) +Math.pow(width,2));
    }
    public void drow(){
            for (int i =0; i<lenght; i++){
                for (int j=0; j<width;j++){
                    System.out.print("*");
                }
                System.out.println();
            }


}


}
