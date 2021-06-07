import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int nro;
        System.out.println("Ingrese número: ");
        nro = scan.nextInt();

        for (int i = 1; i <= nro; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        System.out.println();
        scan.close();
        }
    }
}
