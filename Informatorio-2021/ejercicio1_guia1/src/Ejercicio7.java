import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        String oración;
        System.out.println("Ingrese una oración:");
        oración= scan.nextLine();
        String oraciónFinal= "";
        for(int i=0; i<oración.length(); i++){
            if((oración.charAt(i))>=97 && (oración.charAt(i))<=122){
                char var= (char) ((oración.charAt(i))-32);
                oraciónFinal += var;
            } else if ((oración.charAt(i))==' '){
                oraciónFinal += " ";
            }
        }
        System.out.println(oraciónFinal);
        scan.close();
    }

}
