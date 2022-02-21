package ejercicio9_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SalarioTest {

    @ParameterizedTest
    @CsvSource({
            "-1,0",
            "0,0",
            "1,1",


            "400,400",
            "401,401",
            "402,402",


            "1999,1999",
            "2000,2000",
            "2001,1901",
            "2002,1902",


            "3000,2850",
            "3001,2851",
            "3002,2852",


            "3999,3800",
            "4000,3800",
            "4001,3401",

    })


    public void descuentoTest(int input,int expected) throws Exception {
        Salario salario = new Salario();
        if(input<=0) {

            Assertions.assertThrows(Exception.class, ()-> {salario.descuentoSalario(input);} );
        }else {


            int actual = salario.descuentoSalario(input);
            Assertions.assertEquals(expected,actual,"ERROR!");
        }


    }
}
