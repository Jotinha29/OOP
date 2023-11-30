package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        ArrayList<String> nome = new ArrayList<>();

        //CREATE
        nome.add("João");
        nome.add("Duda");

        //READ
        System.out.println("Primeiro nome: "+nome.get(0));
        System.out.println("Segundo nome: "+nome.get(1));

        //UPDATE 
        nome.set(0, "João 2");
        System.out.println("Primeiro nome: "+nome.get(0));
        System.out.println("Segundo nome: "+nome.get(1));

        //DELETE
        nome.remove(1);
        System.out.println("Último nome: "+nome.get(0));

        //FOREACH
        for (String n : nome) {
            System.out.println(n);
        }

        scan.close();
    }
}
