package OOP_06.Groups;

import java.security.PublicKey;

public class Student {
    private String fio;
    private String ini;
    private  int group;
    private int marcs[];// определим массив
    private  int nMarcs;


    public Student(String fio, String ini, int group) {
        this.fio = fio;
        this.ini = ini;
        this.group = group;
        marcs = new int[5]; //Создание массива производится с помощью конструкции:
        // new тип_данных[количество_элементов], где new - ключевое слово, выделяющее память
        // для указанного в скобках количества элементов
    }
    public void print(){
        System.out.printf("%-16s  %-8s ", fio, ini);
        System.out.printf("Группа %-4d  ", group);
            for (int i=0; i<marcs.length; i++)
        System.out.print(marcs[i]+ "  ");
        System.out.println();
    }

    public  boolean addgrade (int grade){
    if (nMarcs>=5) {return  false;}
    marcs[nMarcs]=grade;
    nMarcs++;
    return true;
    }

    public  boolean isGood (){
        for (int i=0; i<marcs.length; i++){
            if (marcs[i]>=1 && marcs[i]<=4){return false;}

        }
        return true;
    }


}
