package ejercicio9_3_Estatico;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;
import org.mockito.MockedStatic;




public class LoginTest {

    @BeforeAll
    public static void before(){
        MockedStatic<UtilStatic> objetoMock = Mockito.mockStatic(UtilStatic.class);
        MockedStatic<Util2Static> objetoMock2 = Mockito.mockStatic(Util2Static.class);
        objetoMock.when(()->UtilStatic.getPermision("admin","password")).thenReturn("CRUD");
        objetoMock2.when(()->Util2Static.isUserValid("admin","root")).thenReturn(true);
    }

    @Test
    public void verify_role(){


        Login login = new Login();
        String expected = "PERMISSION ROLE CRUD";
        String actual = login.roleUser("admin","password");

        Assertions.assertEquals(expected,actual,"Error");
    }


    @Test
    public void verify_role_incorrect(){

        Login login = new Login();
        String expected = "Incorrect USER and PWD";
        String actual = login.roleUser("asdfg","password");

        Assertions.assertEquals(expected,actual,"Error");
    }
}