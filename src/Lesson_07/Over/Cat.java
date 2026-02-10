package Lesson_07.Over;

public class Cat extends Animals{

    @Override
    public void voice() {
           System.out.println("Мяу " );
    }
    public void voice(String name) {
        System.out.println(name +"говорит Мяу " );
    }
}
