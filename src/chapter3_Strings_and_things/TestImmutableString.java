package chapter3_Strings_and_things;

/**
 * <a href="https://www.javatpoint.com/immutable-string" />
 */
public class TestImmutableString {

    public static void main(String args[]) {
        String s = "Sachin";
        s.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s);//will print Sachin because strings are immutable objects
    }
}
