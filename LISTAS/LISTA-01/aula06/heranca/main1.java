package heranca;

public class main1 {
    public static void main(String[] args){
        System.out.println("Herança");

        pai Fabricio = new pai();
        Fabricio.sobrenome = "Calza";
        System.out.println("Pai: "+Fabricio.sobrenome);


        filho jota = new filho();
        jota.sobrenome= "Alcântara";
        System.out.println("Filho: "+jota.sobrenome);
    }
}
