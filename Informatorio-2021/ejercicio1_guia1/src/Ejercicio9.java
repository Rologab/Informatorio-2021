import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        String oración;
        System.out.println("Ingrese frase:");
        oración= scan.nextLine();
        oración= oración.toLowerCase();
        System.out.println("Ingrese caracter a buscar: ");
        char letra= scan.next().toLowerCase().charAt(0);
        int contador= 0;
        for(int i=0; i<oración.length(); i++){
            if((oración.charAt(i))==letra){
                contador += 1;
            }
        }
        if(contador==1){
            System.out.println("El caracter buscado aparece "+contador+" vez");
        } else {
            System.out.println("El caracter buscado aparece " + contador + " veces");
            scan.close();
        }
    }
}
