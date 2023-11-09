package Lamdas;
public class LambdaPrueba {
    public static void main(String[] args) {
        MiValor miValor = () -> 28.0;
        MiValParam miValParam = (n) -> 1.0 / n;
        System.out.println("Un valor constante: " + miValor.getValor());
        System.out.println("Reciproco de 4 es: " + miValParam.getValor(4.0));
    }
}
