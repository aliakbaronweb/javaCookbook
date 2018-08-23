package chapter3_Strings_and_things;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {
        StringTokenizer st =
                new StringTokenizer("Hello, World|of|Java", ", |", true);
        while (st.hasMoreElements())
            System.out.println("Token: " + st.nextElement());

    }

}
