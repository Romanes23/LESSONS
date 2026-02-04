package Lesson_07.Nasled_02;

public class Teacher extends Human{
  private  String spechiality;
    private int expirience;


    public Teacher(String lastname, String firstname, int age, String spechiality, int expirience) {
        super(lastname, firstname, age);
        this.spechiality = spechiality;
        this.expirience = expirience;
        System.out.println("Constructor Teacher hashcode " + Integer.toHexString(hashCode()));
    }


    public String getSpechiality() {
        return spechiality;
    }

    public void setSpechiality(String spechiality) {
        this.spechiality = spechiality;
    }

    public int getExpirience() {
        return expirience;
    }

    public void setExpirience(int expirience) {
        this.expirience = expirience;
    }


    @Override
    public String toString() {
        return super.toString() +"Teacher{" +
                "spechiality='" + spechiality + '\'' +
                ", expirience=" + expirience +
                '}';
    }


//    @Override
//    public String toString() {
//        return "Teacher{" +
//                "spechiality='" + spechiality + '\'' +
//                ", expirience=" + expirience +
//                ", lastname='" + lastname + '\'' +
//                ", firstname='" + firstname + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
