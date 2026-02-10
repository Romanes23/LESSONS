package Lesson_08.Enums;


import java.util.regex.Pattern;

        enum RegEx{
            UPPER("[A-Z]+"),
            LOWER("a-z+"),
            NUMERIC("[+-]?[0-9]+");

// Svoystvo
private final Pattern pattern;
// Constructor
RegEx(final String pattern){this.pattern = Pattern.compile(pattern);}

            public boolean test(final String input){
            return pattern.matcher(input).matches();
            }



}


public class Text {
    static void main() {
        System.out.println(RegEx.UPPER.test("abc"));
        System.out.println(RegEx.UPPER.test("ABC"));
    }
}