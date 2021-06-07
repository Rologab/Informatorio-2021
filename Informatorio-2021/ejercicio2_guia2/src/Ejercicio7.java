import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int val1, val2;
        System.out.println("Ingrese un valor: ");
        val1 = scan.nextInt();
        System.out.println("Ingrese otro valor, el mismo debe ser mayor al anterior ingresado: ");
        while(true){
            val2 = scan.nextInt();
            if(val2 > val1) {
                break;
            }
            System.out.println("Error, el valor ingresado no es mayor al primer valor ingresado");
        }
        fizzBuzz(val1, val2);
        scan.close();
    }

    static Object[] fizzBuzz(int val1, int val2) {
        List<String> secuenciaNros = new ArrayList<>();
        for (int i = val1; i < val2; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                secuenciaNros.add("FizzBuzz");
            } else if (i % 2 == 0) {
                secuenciaNros.add("Fizz");
            } else if (i % 3 == 0) {
                secuenciaNros.add("Buzz");
            } else {
                secuenciaNros.add(Integer.toString(i));
            }
        }
        System.out.println(secuenciaNros);
        return secuenciaNros.toArray();
    }



}
