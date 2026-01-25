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
            ed_money = money;

           int  ost = money % 10;



            switch ((ost >= 1 && num <= 3) ? 2 :
                (num >= 4 && num <= 6) ? 3 :
                (num >= 7 && num <= 9) ? 4 :
                (num >= 10 && num <= 12) ? 5 : 0) {
            case 2 -> System.out.println(2);
            case 3 -> System.out.println(3);
            case 4 -> System.out.println(4);
            case 5 -> System.out.println(5);
            case 0 -> System.out.println("Такого значения не существует");
        }






            System.out.println("\n" + money + " " + str);
        }
    }


/*            switch (ost) {
                    case 1:
                        str = "копейка";
                        break;
                    case 2:
                        str = "копейки";
                        break;
                    case 3:
                        str = "копейки";
                        break;
                    case 4:
                        str = "копейки";
                        break;
                    default:
                        str = "копеек";
                        break;
                }*/

//     if(ed_money > 10 || ed_money < 20) str = "копеек";


