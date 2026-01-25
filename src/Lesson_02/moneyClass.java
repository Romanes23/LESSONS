package Lesson_02;
import java.util.Scanner;
public class moneyClass {

        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            int money = 0;
            int ed_money = 0;
            String str = "";
            System.out.println("Введите число(1-99) :");
            money = scn.nextInt();
            int  ost = money % 10;


                    switch ((( money < 10 || money > 20) && ost == 1 ) ? 1 : (ost >= 2 && ost <= 4) ? 2 : (ost >4) ? 3 :0)  {
            case 1 -> System.out.println("копейка");
            case 2 -> System.out.println("копейки");
            case 3 -> System.out.println("копеек");
            case 0 -> System.out.println("копеек");
            }
            System.out.println("\n" + money + " " + str);
        }
    }


