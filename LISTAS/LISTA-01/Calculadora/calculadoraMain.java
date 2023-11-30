package Calculadora;
public class calculadoraMain {
    public static void main(String[] args) {
        var calcula = new Calculadora();
        int soma = calcula.soma(10,5);
        int subtrair = calcula.subtrai(10, 5);

        System.out.println(soma);
        System.out.println(subtrair);

        System.out.println("Soma: " + calcula.soma(10,5));
        System.out.println("Soma: " + calcula.subtrai(10,5));
    }
}
