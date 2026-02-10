package DZ1602;

interface Operation{
    int  execute();
}

public class Program {


    static String str1 = "Лямбда выражение";
    static String str2 = "Программа, которая подсчитывает количество слов в предложении";

    public static void main(String[] args) {
        String[] words1 = str1.split(" "); // массивы слов
        String[] words2 = str2.split(" ");
        String[][] nums = new String[2][];

        nums[0] = words1;
        nums[1] = words2;
        Operation op = () -> {
            for (int i = 0; i < nums.length; i++) {
                int q = 0;
                for (int j = 0; j < nums[i].length; j++) {
                         int str2_ = nums[i][j].toCharArray().length;
                            if (str2_ > 2) {q += 1;}    // исключаем предлоги
                }
                System.out.println("Количество слов в предложении равно   " + q);

            };
        return 0;
        };
        op.execute();
    }
}
