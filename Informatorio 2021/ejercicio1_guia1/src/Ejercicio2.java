import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        double nro1;
        double nro2;
        System.out.println("Ingrese primer número: ");
        nro1= scan.nextInt();
        System.out.println("Ingrese segundo número: ");
        nro2= scan.nextInt();

        double suma= nro1+nro2;
        double resta= nro1-nro2;
        double mult= nro1*nro2;
        double div= nro1/nro2;
        double mod= nro1%nro2;

        System.out.println("Suma: "+suma);
        System.out.println("Resta "+resta);
        System.out.println("Multiplicación "+mult);
        System.out.println("División "+div);
        System.out.println("Módulo "+mod);
        scan.close();
    }

}
