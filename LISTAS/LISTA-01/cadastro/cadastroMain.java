package cadastro;
import java.util.Scanner;

public class cadastroMain {
    public static void main(String[] args){
        CadastroCliente cliente[] = new CadastroCliente[2];
        var scan = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            cliente[i] = new CadastroCliente();
            System.out.print("Digite seu nome: ");
            cliente[i].nome = scan.next();
            System.out.print("Digite seu CPF: ");
            cliente[i].CPF = scan.next();
        }
            
        System.out.println("Utilize o token \npara retirada: ");
        System.out.println("CLIENTE 1: " + cliente[0].retirar("TOKEN"));
        System.out.println("CLIENTE 1: " + cliente[1].retirar("TOKEN-XPTO"));

        scan.close();
    }

}