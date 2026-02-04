package Lesson_07.Nasled_02;

public class Specialist extends Graduate{
    private int level;

    public Specialist(String lastname, String firstname, int age, String spetiality, String group, int rating, String subject, int level) {
        super(lastname, firstname, age, spetiality, group, rating, subject);
        this.level = level;
        System.out.println("Constructor Specialist  hashcode " + Integer.toHexString(hashCode()));
    }

    public Specialist(Graduate graduate, int level) {
        super(graduate);
        this.level = level;
        System.out.println("Constructor Specialist COPY hashcode " + Integer.toHexString(hashCode()));
    }





    @Override
    public String toString() {
        return super.toString() + "Specialist{" +
                "level=" + level +
                '}';
    }
}
