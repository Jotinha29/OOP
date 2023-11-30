package cadastro;

public class CadastroCliente {
    String nome;
    String CPF;

    String pagar(float valor){
        return "TOKEN-XPTO";
    }

    boolean retirar(String token){
        if(token=="TOKEN-XPTO"){
            return true;
        } else {
            return false;
        }
    }
}
