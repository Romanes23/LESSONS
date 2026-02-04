package DZ1202;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Батодаев ", "Даши", 16);
            System.out.println(human);
        Student student =new Student("Загидулин", "Линар",  25, "РПО", "РПО_011", 5);
            System.out.println(student);
        Teacher teacher = new Teacher("Даньшин", "Андрей", 38, "Астрофизика",110);
            System.out.println(teacher);
        Graduate graduate =new Graduate("Шугани", "Сергей", 15,"РПО", "01-15",5,"Защита персональных данных");
            System.out.println(graduate);

        Student student1 = new Student(human, "ГК","ВЭБ-111",5);
            System.out.println(student1);
        Graduate graduate1 =new Graduate(student,"Мат выражения");
            System.out.println(graduate1);

        Specialist specialist = new Specialist(graduate, 10);
            System.out.println(specialist);
    }
}
