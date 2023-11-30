package carro;
public class classe_E_atributo {
    public static void main(String[] args){
        var fusca = new carro();

        fusca.cor = "Azul";
        fusca.modelo = "fusca";
        fusca.ano = 1978;
    
        System.out.println("Modelo: "+ fusca.modelo);
        System.out.println("Ano: " + fusca.ano);
        System.out.println("Cor: "+ fusca.cor);

        carro fiesta = new carro();
        
        fiesta.cor = "branco";
        fiesta.modelo = "Fiesta";
        fiesta.ano = 2006;

        System.out.println("Modelo: "+ fiesta.modelo);
        System.out.println("Ano: " + fiesta.ano);
        System.out.println("Cor: "+ fiesta.cor);
    }
}
