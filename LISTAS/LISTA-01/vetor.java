import java.util.Arrays;

public class vetor {
    public static void main(String[] args){

        int  primerioArray[] = new int[10];
        int[] segundoArray = {1,3,8,2};
        String nomes[] = new String[10];

        nomes[0] = "Jota";
        nomes[9]= "JOTA";

        primerioArray[0]=4;
        System.out.printf("Número do vetor 1 da posição 0: %d\n", primerioArray[0]);

        System.out.printf("Número do vetor 2 da posição 2: %d\n",segundoArray[2]);

        System.out.printf("String: %s\n", nomes[0]);
        System.out.printf("tamanho da String: %s\n", nomes[9].length());
        

        segundoArray[0] = 10;
        System.out.printf("Tamanho do segundo vetor: %s\n", segundoArray.length);

        for(int x=0; x<segundoArray.length; x++){
            System.out.printf("Valor %d do vetor 2: %d\n",x+1,segundoArray[x]);
        }

        //estudar essa parte depois 
        Arrays.sort(segundoArray);

        System.out.println("---------ORDENADO---------");

        for(int numero : segundoArray){
            System.out.println(numero);
        }

    }
}