package chapter3_Strings_and_things;

/**
 * <a href="https://www.javatpoint.com/immutable-string" />
 * <a href="https://stackoverflow.com/questions/8798403/string-is-immutable-what-exactly-is-the-meaning" />
 */
public class ImmutableStringDemo {

    public static void main(String args[]) {
        String s = "Sachin";
        String str = s;     // assigns a new reference to the same string "knowledge"
        s.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s);//will print Sachin because strings are immutable objects
    }
}
