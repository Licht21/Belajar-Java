package muhammad;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        String[] names = {"Muhammad","Yusuf","Aulia"};
        StringJoiner stringJoiner = new StringJoiner("||","[","]");

        for (String name:names) {
            stringJoiner.add(name);
        }

        System.out.println(stringJoiner);
    }
}
