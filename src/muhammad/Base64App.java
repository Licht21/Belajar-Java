package muhammad;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String query = "Muhammad Yusuf Aulia";

        String encode = Base64.getEncoder().encodeToString(query.getBytes());
        System.out.println(query.getBytes());
        System.out.println(encode);

        String decode = new String(Base64.getDecoder().decode(encode));
    }
}
