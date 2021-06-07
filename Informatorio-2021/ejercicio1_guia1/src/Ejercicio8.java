import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        String nomyap;
        int edad;
        String dirección;
        String ciudad;

        System.out.println("Ingrese nombre y apellido: ");
        nomyap= scan.nextLine();

        System.out.println("Ingrese edad: ");
        edad= scan.nextInt();

        scan.nextLine();

        System.out.println("Ingrese dirección: ");
        dirección= scan.nextLine();

        System.out.println("Ingrese ciudad: ");
        ciudad= scan.nextLine();

        System.out.println(ciudad+"-"+dirección+"-"+edad+"-"+nomyap);
        scan.close();

    }

}
