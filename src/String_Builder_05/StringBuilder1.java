package String_Builder_05;

public class StringBuilder1 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
sb.append("Hello");
//System.out.println(sb);

        sb.append("!");
        sb.append(true); // добавит как string
        sb.append(10.20f);
//        sb.append("Hello");
        System.out.println(sb);
        sb.insert(5,"MAC&&&&&&");   // вставка HelloMAC&&&&&&!true10.2

        System.out.println(sb);
        sb.delete(5,8); //   Удаление 6,7,8 Hello&&&&&&!true10.2
        System.out.println(sb);

        sb.replace(5,9, "JavaScript"); // c 6 по 9 удаляем, а потом вставляем Java Script
        System.out.println(sb);
        System.out.println(sb.substring(5,9)); // подстрока

        System.out.println(sb);
        System.out.println(sb.indexOf("Java Script"));
        System.out.println(sb.indexOf("Java Script_New"));  // -1 нету значит
        System.out.println(sb.indexOf("a")); // первое вхождение буквы а
        int m = sb.indexOf("a")+1;
        System.out.println(sb.indexOf("a",m)); // следующее вхождение буквы а
//        System.out.println(sb);
//        System.out.println(sb.indexOf("S")); //
//        sb.deleteCharAt(sb.indexOf("S")); // даляет один символ
//        System.out.println(sb);


    }

}
