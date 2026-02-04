package DZ1202;

public class Student extends Human {
    private String spetiality;
    private String group;
    private int rating;

    public Student(String lastname, String firstname, int age, String spetiality, String group, int rating) {
        super(lastname, firstname, age);
        this.spetiality = spetiality;
        this.group = group;
        this.rating = rating;
        System.out.println("Constructor STUDENT hashcode " + Integer.toHexString(hashCode()));
    }
    public Student(Human human, String spetiality, String group, int rating) {   // 1 Это конструктор копирования, дальше в Human
       super(human);
        this.spetiality = spetiality;
        this.group = group;
        this.rating = rating;
        System.out.println("Constructor STUDENT COPY hashcode " + Integer.toHexString(hashCode()));
    }
    public Student(Student other) {   // 1 Это конструктор копирования, дальше в Human
        super(other);
        this.spetiality = other.spetiality;
        this.group = other.group;
        this.rating = other.rating;
        System.out.println("Constructor STUDENT COPY hashcode " + Integer.toHexString(hashCode()));
    }

    public String getSpetiality() {
        return spetiality;
    }

    public void setSpetiality(String spetiality) {
        this.spetiality = spetiality;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "spetiality='" + spetiality + '\'' +
                ", group='" + group + '\'' +
                ", rating=" + rating +
                '}';
    }



//    @Override
//    public String toString() {
//        return "Student{" +
//                "spetiality='" + spetiality + '\'' +
//                ", group='" + group + '\'' +
//                ", rating=" + rating +
//                ", lastname='" + lastname + '\'' +
//                ", firstname='" + firstname + '\'' +
//                ", age=" + age +
//                '}';
//    }

}