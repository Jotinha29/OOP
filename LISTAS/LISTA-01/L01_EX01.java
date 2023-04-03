import java.util.Scanner;


public class L01_EX01 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // INT
        System.out.print("Digite um valor do tipo inteiro(10*x): ");
        var Int = scanner.nextInt();
        System.out.println("Você digitou: " + Int);

        // Double
        System.out.print("Digite um valor do tipo Double(xx,xx): ");
        var varDouble = scanner.nextDouble();
        System.out.println("Você digitou: " + varDouble);

        // Char
        System.out.print("Digite um valor do tipo caractere(a): ");
        var varChar = scanner.next().charAt(0);
        System.out.println("Você digitou: " + varChar);

        // Bool
        System.out.print("Digite um valor do tipo bool (true/false): ");
        var varBool = scanner.nextBoolean();
        System.out.println("Você digitou: " + varBool);

        // Byte
        System.out.print("Digite um valor do tipo byte(xxx): ");
        var byteValor = scanner.nextByte();
        System.out.println("Você digitou: " + byteValor);

        // Short
        System.out.print("Digite um valor do tipo Short(xxxxx): ");
        var varShort = scanner.nextShort();
        System.out.println("Você digitou: " + varShort);

        // Long
        System.out.print("Digite um valor do tipo Long(20*x): ");
        var varLong = scanner.nextLong();
        System.out.println("Você digitou: " + varLong);

        scanner.close();
    }
}
