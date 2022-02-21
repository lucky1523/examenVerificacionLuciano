package ejercicio9_2;

import java.time.LocalDateTime;

public class LoginNormal {

    public LoginNormal(){}

    UtilStaticNormal utilStaticNormal = new UtilStaticNormal();
    Util2StaticNormal util2StaticNormal = new Util2StaticNormal();
    String message;

    public String roleUser(String user, String pwd) {
        if (util2StaticNormal.isUserValid(user, pwd)) {
            message = "PERMISSION ROLE " + utilStaticNormal.getPermision(user, pwd) + " " + LocalDateTime.now();
        } else {
            message = "Incorrect USER and PWD";
        }

        return message;
    }
}
