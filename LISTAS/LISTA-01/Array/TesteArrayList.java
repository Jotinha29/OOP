package Array;

import java.util.Scanner;
import java.util.ArrayList;


public class TesteArrayList {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        ArrayList<String> nome = new ArrayList<>();

        //CREATE
        nome.add("João");
        nome.add("Duda");
        nome.add("Ana");
        nome.add("Safira");
        nome.add("MatiaS");

        //READ
        System.out.println("Primeiro nome: "+nome.get(0));
        System.out.println("Segundo nome: "+nome.get(1));

        //UPDATE 
        nome.set(0, "João 2");
        System.out.println("Primeiro nome: "+nome.get(0));
        System.out.println("Sgeundo nome: "+nome.get(1));

        //DELETE
        nome.remove(1);
        System.out.println("Primeiro nome: "+nome.get(0));

        //FOREACH
        System.out.println(nome);

        scan.close();
    }
}
