package exception.login;

import exception.Error;
import exception.Runtime;
import exception.Throw;

public class LoginRequest {

    private String username;
    private String password;

    public LoginRequest (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void validate() throws Throw {
        if(this.username == null) {
            throw new Runtime("username tidak boleh null");
        } else if (this.username.isBlank()) {
            throw new Throw("username tidak boleh kosong");
        } else if (this.password == null) {
            throw new Runtime("password tidak boleh null");
        } else if (this.password.isBlank()) {
            throw new Throw("password tidak boleh kosong");
        }
    }

    public void databaseConnection() {
        throw new Error("ga konek si");
    }
}
