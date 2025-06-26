package muhammad;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        StringTokenizer stringTokenizer = new StringTokenizer("Muhammad Yusuf Aulia"," ");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
