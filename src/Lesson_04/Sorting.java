package Lesson_04;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

public static void bubbleSort(int[] sortArr){
    for (int i = 0; i < sortArr.length - 1; i++) {
        for(int j = 0; j < sortArr.length - i - 1; j++) {
            if(sortArr[j + 1] < sortArr[j]) {
                int swap = sortArr[j];
                sortArr[j] = sortArr[j + 1];
                sortArr[j + 1] = swap;
            }
        }
    }
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pmenu;
        int[] numbers = new int[10];
        String[] menu = new String[]{" 1. Ввод элементов массива (10 значений)", " 2. Отображение элементов массива", " 3. Поиск элементов массива по значению",
                " 4. Сортировка массива методом пузырьков", " 5. Выход"};
        do {
            for (int i = 0; i < menu.length; i++) {
                System.out.println(menu[i]);
            }


            System.out.print("Выберите пункт меню : ");
            pmenu = sc.nextInt();

            switch (pmenu) {
                case 1:
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.print("Введите число: ");
                        int num = sc.nextInt();
                        numbers[i] = num;
                    }
                    break;
                case 2:
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.print(numbers[i] + ", ");
                    }
                    break;
                case 3:
                    System.out.print("Введите число для поиска: ");
                    int num_1 = sc.nextInt();
                    for (int i = 0; i < numbers.length; i++) {
                        if (numbers[i] == num_1) System.out.println("Это элемент № " + i + ", ");
                    }
                    break;

                case 4:
                    bubbleSort(numbers);
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.print(numbers[i] + ", ");
                    }

                    break;

                default:
                    System.out.println("Такого пункта меню у нас нет нет");
            }

        } while (pmenu < 5);


    }


}
