package DZ0902;

public class Student {
    public static void main(String[] args) {

        Student Roman = new Student("Roman");
        Student Vladimir = new Student("Vladimir");
        String  str = Student.Nout.showNout();
        System.out.println(Roman.name + " =>" + str+"\n");
        System.out.println(Vladimir.name + " =>" +str);
    }


    String name;
    public Student(String name) {
        this.name = name;
    }



    class Nout {
        static String brand;
        static String proc;
        static int ozu;
        static { brand = "HP";  proc = "i7";  ozu =16;}
        public static   String showNout(){
        String m = (" "+ Nout.brand +" "+Nout.proc+ " "+   Nout.ozu );
         return m;
        }
    }


}
//git remote add origin https://github.com/Romanes23/LESSONS.git
//git branch -M main
//git push -u origin main


//git init
//git add README.md
//git commit -m "first commit"
//git branch -M main
//git remote add origin https://github.com/Romanes23/Java_01.git
//git push -u origin main