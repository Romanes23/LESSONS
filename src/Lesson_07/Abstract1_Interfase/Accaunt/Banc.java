package Lesson_07.Abstract1_Interfase.Accaunt;

import java.util.ArrayList;

public class Banc {

    private ArrayList <Accaunt> accaunts;
    public Banc (){
        this.accaunts =new ArrayList<>();
    }

public  void addAccount(Accaunt accaunt){
        this.accaunts.add(accaunt);

}
public void deposit(Accaunt accaunt, double amount){
        accaunt.deposite(amount);
}

public void  withDraw(Accaunt accaunt, double amount){

        accaunt.withdraw(amount);
}
public void printAccountBalance(){
for (Accaunt accaunt:accaunts){

    System.out.println(  " ==== Прямоугольник === " + accaunt.getBalance());
}

}

}


