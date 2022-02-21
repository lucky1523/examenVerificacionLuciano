package ejercicio9_1;

public class Salario {

    public int descuentoSalario(int salario) throws Exception {
        if (salario <= 0) {
            throw new Exception("Salario invalido");
        } else if (salario <= 2000) {
            return salario;
        } else if (salario <= 4000) {
            return salario - salario * 5 / 100 ;
        } else {
            return salario - salario * 15 / 100;
        }
    }

}