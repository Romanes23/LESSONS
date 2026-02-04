package DZ1202;

public class Graduate extends Student {
    private String subject;

    public Graduate(String lastname, String firstname, int age, String spetiality, String group, int rating, String subject) {
        super(lastname, firstname, age, spetiality, group, rating);
        this.subject = subject;
        System.out.println("Constructor Graduate hashcode " + Integer.toHexString(hashCode()));
    }

    public Graduate(Student student, String subject) {
        super(student);
        this.subject = subject;
        System.out.println("Constructor Graduate COPY hashcode " + Integer.toHexString(hashCode()));
    }
    public Graduate(Graduate other) {
        super(other);
        this.subject = other.subject;
        System.out.println("Constructor Graduate COPY hashcode " + Integer.toHexString(hashCode()));
    }

    @Override
    public String toString() {
        return super.toString() + "Graduate{" +
                "subject='" + subject + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", age=" + age +
                '}';
    }
}
