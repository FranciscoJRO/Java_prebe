package Lamdas;
import java.util.stream.IntStream;

public class Filtro {
    public static void main(String[] args) {
        IntStream.range(1, 10).filter(a->a % 2 ==0).forEach(System.out::println);
    }
}
