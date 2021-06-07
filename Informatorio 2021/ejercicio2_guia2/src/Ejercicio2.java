import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    public static void main(String[] args) {
        List<Integer> nums  = new ArrayList<>();
        nums.add(3);
        nums.add(4);
        nums.add(6);
        nums.add(2);
        nums.add(11);
        for(int i = 0; i < nums.size(); i++){
            System.out.println(nums.get(i));
        }
        System.out.println("El tamaño de la lista es " + nums.size());
        nums.add(0, 9);
        nums.add(16);
        for(int i = 0; i < nums.size(); i++){
            System.out.println(nums.get(i));
        }
        System.out.println("El tamaño de la lista es " + nums.size());
    }

}
