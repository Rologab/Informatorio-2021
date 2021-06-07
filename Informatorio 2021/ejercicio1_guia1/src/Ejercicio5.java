import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        int nro1;
        int nro2;
        int res= 0;
        System.out.println("Ingrese primer número: ");
        nro1= scan.nextInt();
        System.out.println("Ingrese segundo número: ");
        nro2= scan.nextInt();

            for(int i=1; i<=nro2; i++){
                res += nro1;
            }
            System.out.print("El resultado es: "+res);
            scan.close();
        }

}
