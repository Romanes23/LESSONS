package DZ1602;

import java.util.Arrays;
// Создайте программу для подсчета слов в предложениях ч.з лямбда выражения
public class Lambda {
    static void main(String[] args) {
        String str1 = "Лямбда выражение";
        String str2 = "Программа, которая подсчитывает количество слов в предложении";
        String[] words1 = str1.split(" ");
        String[] words2 = str2.split(" ");   // массивы слов

        int q=0;


        for (int i=0;i< words2.length;i++ ) {     // исключаем предлоги

           int str2_ = words2[i].toCharArray().length;
           if (str2_>2)
               q+=1;
            System.out.println(str2_);
            }
        System.out.println("Количество сдлв в предложении равно "+ q);
        }
        int m=0;

}
