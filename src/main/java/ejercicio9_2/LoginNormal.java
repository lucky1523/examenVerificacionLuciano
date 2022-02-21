package ejercicio9_2;

import java.time.LocalDateTime;

public class LoginNormal {

    String message;

    public String roleUser(String user, String pwd) {
        if (Util2StaticNormal.isUserValid(user, pwd)) {
            message = "PERMISSION ROLE " + UtilStaticNormal.getPermision(user, pwd) + " " + LocalDateTime.now();
        } else {
            message = "Incorrect USER and PWD";
        }

        return message;
    }
}
