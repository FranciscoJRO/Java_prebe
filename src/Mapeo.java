import java.util.Arrays;
import java.util.List;

public class Mapeo{
    public static void main(String[] args) {
        System.out.println("Los elementos de la lista son:");
        List<Integer> lista = Arrays.asList(3,6,9,12,15);
        lista.stream().map(a->a*3).forEach(System.out::println);
    }
}