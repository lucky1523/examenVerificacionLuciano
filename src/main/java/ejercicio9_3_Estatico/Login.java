package ejercicio9_3_Estatico;

import java.time.LocalDateTime;

public class Login {

    String message;

    public String roleUser(String user, String pwd) {
        if (Util2Static.isUserValid(user, pwd)) {
            message = "PERMISSION ROLE " + UtilStatic.getPermision(user, pwd) + " " + LocalDateTime.now();
        } else {
            message = "Incorrect USER and PWD";
        }

        return message;
    }
}
