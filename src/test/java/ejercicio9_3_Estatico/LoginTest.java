package ejercicio9_3_Estatico;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.Assertions;
import org.mockito.MockedStatic;

import java.time.LocalDateTime;


public class LoginTest {

    @BeforeAll
    public static void before(){
        MockedStatic<UtilStatic> objetoMock = Mockito.mockStatic(UtilStatic.class);
        MockedStatic<Util2Static> objetoMock2 = Mockito.mockStatic(Util2Static.class);
        objetoMock.when(()->UtilStatic.getPermision("admin","password")).thenReturn("CRUD");
        objetoMock2.when(()->Util2Static.isUserValid("admin","password")).thenReturn(true);
    }

    @Test
    public void verify_role(){
        System.out.println("*");
        System.out.println("*");
        Login login = new Login();
        String expected = "PERMISSION ROLE CRUD" + " " + LocalDateTime.now();
        String actual = login.roleUser("admin","password");

        System.out.println(expected);
        System.out.println(actual);
        Boolean resul = actual.contains("PERMISSION ROLE CRUD" + " " + LocalDateTime.now());

        System.out.println(resul);
        Assertions.assertTrue(resul);
    }


    @Test
    public void verify_role_incorrect(){

        Login login2 = new Login();
        String expected = "Incorrect USER and PWD";
        String actual = login2.roleUser("asdfg","password");

        Assertions.assertEquals(expected,actual,"Error");
    }
}