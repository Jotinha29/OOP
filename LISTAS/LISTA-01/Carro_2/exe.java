package Carro_2;

import java.util.Scanner;

public class exe {
    public static void main(String[] args) {
        String out;
        Scanner ler = new Scanner (System.in);
        carro Carro = new carro();
        carro Carro2 = new carro();

        System.out.print("Informe o modelo do seu carro: ");
        out = ler.next();
        Carro.setModelo(out);
        System.out.print("\nInforme a cor do seu carro: ");
        out = ler.next();
        Carro.setCor(out);
        System.out.print("\nInforme a placa do seu carro: ");
        out = ler.next();
        Carro.setPlaca(out);
        
        System.out.print("\nInforme o modelo do seu carro: ");
        out = ler.next();
        Carro2.setModelo(out);
        System.out.print("\nInforme a cor do seu carro: ");
        out = ler.next();
        Carro2.setCor(out);
        System.out.print("\nInforme a placa do seu carro: ");
        out = ler.next();
        Carro2.setPlaca(out);

        System.out.println("\nMODELO: " +Carro.modelo);
        System.out.println("COR: " +Carro.cor);
        System.out.println("Placa: " +Carro.placa);

        System.out.println("MODELO: " +Carro2.modelo);
        System.out.println("COR: " +Carro2.cor);
        System.out.println("Placa: " +Carro2.placa);
        
        ler.close();
    }
}
