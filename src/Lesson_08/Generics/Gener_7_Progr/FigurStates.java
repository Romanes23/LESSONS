package Lesson_08.Generics.Gener_7_Progr;

public class FigurStates<FigurType extends Figure> {
    FigurType[] figures;

    public FigurStates(FigurType[] figures) {
        this.figures = figures;
    }

    public double getSumArea() {
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            sum += figures[i].getArea();
        }
        return sum;
    }
    public double getMaxSumArea() {
        double maxArea = Double.MIN_VALUE;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getArea()>maxArea)
                maxArea += figures[i].getArea();
        }
        return maxArea;
    }
    public double getMinSumArea() {
        double minArea = Double.MAX_VALUE;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getArea()<minArea)
                minArea = figures[i].getArea();
        }
        return minArea;
    }


}
