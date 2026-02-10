package DZ1602;


interface Operationable{   // Объявили  интерфейс
    int execute(); // объявили метод интерфеса  ключевое слово return  не используется
}

public class Program1 {

    static int a = 0;
    static int b = 20;

    public static void main(String[] args) {

        Operationable op; // Объявили объект интерфейса
        op = ()->a-b; //передали хотелки


        int result = op.execute(); // вызвали метод интерфейса и передали ему папраметры



        System.out.println(result); //30
    }
}
