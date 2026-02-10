package Lesson_08.Enums2;

import java.util.Random;

public enum Direction {
    TOP,RIGHT,BOTTOM,LEFT; //Объекты класса

    private static final Random RANDOM = new Random();
    public static Direction randomDirection(){
        Direction[] direction = values();
        return direction[RANDOM.nextInt(direction.length)];
    }



}
