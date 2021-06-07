import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public static void main(String[] args) {
        List<String> alums  = new ArrayList<String>() {{ add("Roberto Carlos"); add("Ana María"); add("Juan Soler"); add("Alejandra Angelina"); add("Elsa Ramona"); add("Jeremías Springfields"); add("Martín Palermo"); add("Bob Esponja"); add("Silvia Reynoso"); add("Armando Diego"); add("Fidel López"); add("Marta Ríos");}};
        List<String> curso1 = alums.subList(0,4);
        System.out.println("Alumnos del curso 1: ");
        for(int i = 0; i < curso1.size(); i++){
            System.out.println(curso1.get(i));
        }

        List<String> curso2 = alums.subList(4,8);
        System.out.println("Alumnos del curso 2: ");
        for(int i = 0; i < curso2.size(); i++){
            System.out.println(curso2.get(i));
        }

        List<String> curso3 = alums.subList(8,12);
        System.out.println("Alumnos del curso 3: ");
        for(int i = 0; i < curso3.size(); i++){
            System.out.println(curso3.get(i));
        }
    }

}
