import java.util.Scanner;

public class EntradaString {
  public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
      String nome;

      System.out.println("Insira seu nome: ");
      nome = leitor.next();

      System.out.println("Nome: " + nome);
      leitor.close();
    }
}
