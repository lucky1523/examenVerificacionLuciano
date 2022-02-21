package ejercicio9_2;
import ejercicio9_2.LoginNormal;
import ejercicio9_2.UtilStaticNormal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class LoginNormalTest {
    UtilStaticNormal mock = Mockito.mock(UtilStaticNormal.class);
    Util2StaticNormal mock2 = Mockito.mock(Util2StaticNormal.class);

    @Test
    public void verify_role(){

        Mockito.when(mock.getPermision("admin","password")).thenReturn("CRUD");
        LoginNormal loginNormal = new LoginNormal();
        String actual = loginNormal.roleUser("admin","password");
        String  expected = "PERMISSION ROLE";
        Assertions.assertTrue(actual.contains(expected));



    }


}
