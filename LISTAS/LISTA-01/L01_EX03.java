import java.util.Scanner;

public class L01_EX03 {
    
    public static void main(String[] args){
        var Scanner = new Scanner(System.in);

        System.out.print("Informe o nome do estudante:");
        String nome = Scanner.next();

        double n[] = new double[4];
        
        for(int x=0; x<4; x++){
            System.out.printf("Informe sua nota: ");
            n[x] = Scanner.nextDouble();
        }
        

        double media = (n[0]*2+n[1]*3+n[2]*4+n[3]*1)/10;
        
        System.out.printf("Média do aluno: %.1f", media);
        System.out.println();
        
        if (media >= 7.0) {
            System.out.println("APROVADO");
        } else if (media < 5.0) {
            System.out.println("REPROVADO");
        } else {
            System.out.println("RECUPERAÇÃO");


            System.out.printf("Digite a nota da recuperação: ");
            double nRecu = Scanner.nextDouble();

            double mediaRecu = (media + nRecu) / 2;

            System.out.printf("Nota da recuperação: %.1f%n", nRecu);
            if (mediaRecu >= 5.0) {
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO");
            }
            System.out.printf("Media final: %.1f%n", mediaRecu);
        }

        Scanner.close();
    }
}

