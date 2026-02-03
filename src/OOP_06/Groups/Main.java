package OOP_06.Groups;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n =10;
        Student[] students = new Student[10];  // создаем объект класса типа массив
        // и заполняем его студентами
        students[0] = new Student("Петров", "ВА", 1);
        students[1] = new Student("Иванов", "МА", 1);
        students[2] = new Student("Сидоров", "АА", 1);
        students[3] = new Student("Аваров", "ВА", 2);
        students[4] = new Student("Утриров", "ВА", 2);
        students[5] = new Student("Капаров", "ДА", 3);
        students[6] = new Student("Азаров", "ЕА", 3);
        students[7] = new Student("Михайлов", "ЦА", 3);
        students[8] = new Student("Куров", "ЛА", 3);
        students[9] = new Student("Петухов", "ЗА", 3);

        Random rand = new Random();
        for (int i=0; i< n; i++)
            for (int j=0;j< students.length; j++ )
                students[i].addgrade(rand.nextInt(12+1)+1);

        System.out.println("Все студенты");
        for (int i=0; i<students.length; i++){
          students[i].print();
        }
        System.out.println("Студенты с хорошей успеваемостью");
        for (int i=0; i<students.length; i++){
           if (students[i].isGood())
            students[i].print();
        }


    }

}
