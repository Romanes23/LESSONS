package OOP_06;

import java.util.Random;  // С помощью класса легче генерить

public class Rendom {
    public static void main(String[] args) {
        Random rand = new Random();
        int cnt = 10;
        int min =5;
        int max = 20;
        for (int i = 0; i < cnt; i++) {
//            System.out.println(rand.nextInt(max));
            System.out.println(rand.nextInt(max-min+1)+min);  //диапазон
        }
//        for (int i = 0; i < cnt; i++) {
//            System.out.println(rand.nextBoolean());
//        }
//        for (int i = 0; i < cnt; i++) {
//            System.out.println(rand.nextDouble());
//        }
    }
}
