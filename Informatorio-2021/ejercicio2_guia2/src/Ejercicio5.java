import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {

        List<Integer> horasDeTrabajo  = new ArrayList<Integer>() {{ add(6); add(8); add(4); add(6); add(8);}};

        List<Integer> valorPorHora  = new ArrayList<Integer>() {{ add(500); add(277); add(130); add(340); add(480);}};

        int totalFinal=0;

        List<Integer> sueldos  = new ArrayList<>();

        for(int i=0; i<horasDeTrabajo.size();i++){

            sueldos.add((horasDeTrabajo.get(i))*(valorPorHora.get(i)));
            totalFinal += sueldos.get(i);
        }

        System.out.println("Sueldo Semanal: " + sueldos);

        System.out.println("Total final: "+totalFinal);
    }

}
