package Direct_5;

import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        Endereco  endereco = new Endereco();
        endereco.cep = "0000000";
        //dados do endereço

        cliente cliente = new cliente();

        //dados do cliente

        //tomada de decisão
        //sempre deve verificar se ele é null (nulo), para não cometer erro
       /* if(cliente.enderecos == null){
            cliente.enderecos =new ArrayList<Endereco>();
        }

        */

        cliente.adicionaEndereco(endereco);// O objeto em questão é a lista
        System.out.println("Endereço adicionado com sucesso!!");
    }
}
