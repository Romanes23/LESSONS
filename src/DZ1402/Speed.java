package DZ1402;

public enum Speed {
    AIRPLAN("Скорость самолета составляет", 600),
    CAR("Скорость автомобиля составляет", 65),
    TRACK("Скорость грузовика составляет", 55 ),
   TRAIN("Скорость поезда составляет", 70 ),
    BOAT("Скорость катера составляет", 22);

    // Объявляем свойства
    private String tile;
    int number;

    // это обычный конструктор класса
    Speed (String tile, int number){ this.tile= tile; this.number=number;}


    @Override  // переопределили хэш то стринг
    public String toString() {return  tile + "  " + number+ " миль/ч "; }

}




