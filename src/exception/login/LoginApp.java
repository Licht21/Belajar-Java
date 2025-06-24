package exception.login;

import exception.Runtime;
import exception.Throw;

public class LoginApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Aulia",null);
        try {
            loginRequest.validate();
            System.out.println("Berhasil");
        } catch (Throw | NullPointerException | Runtime e) {
            e.printStackTrace();
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            for(StackTraceElement stackTraceElement:stackTraceElements) {
                System.out.println(stackTraceElement);
            }
            System.out.println("gagal " + e.getMessage());
        }

//        loginRequest.databaseConnection();
    }
}
