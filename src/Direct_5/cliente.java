package Direct_5;

import java.util.ArrayList;
import java.util.List;

public class cliente extends pessoa {

    // Aributos do cliente
    // Atributo que pode ser acessado direto pois está como "public"
    /*public Integer codigo;
    public String nome;
    public String cpf;

     */
    //Jeito não recomendado
    /*
    // Mais de um endereço
    public String endereco1;
    public String numero1;
    public String complemento1;
    public String bairro1;
    public String estado1;
    public String cep1;

    public String endereco2;
    public String numero2;
    public String complemento2;
    public String bairro2;
    public String estado2;
    public String cep2;

    public String endereco3;
    public String numero3;
    public String complemento3;
    public String bairro3;
    public String estado3;
    public String cep3;

     */


    // crie uma class para endereço

    // Mesmo que seja um pouco melhor e simples, ainda não esta bom
    /*
    public Endereco endereco;
    public Endereco enderecoEntrega;
    public Endereco enderecoTrabalho;

     */

    // Criando uma lista de endereços, você vai ter que dizer o tipo de endereço;
    // jeito mais simples e uma boa pratica de programação
    // Deve sempre usar o "private" e não o "public"  para essa pratica !!!!!
    private List<Endereco> enderecos;

    // emcapsulamento
        // Verificando e validando o endereço
    public void adicionaEndereco(Endereco endereco){
        if (endereco == null) {
            throw  new NullPointerException(" o endereço não pode ser nulo!");
        }

        //verificando e validando o cep
        if (endereco.cep == null){
            throw new NullPointerException("cep não pode ser nulo!");
        }
        // adicionando o endereço a lista depois de validado
        getEnderecos().add(endereco);
    }
    /*public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

     */

    private List<Endereco> getEnderecos() {
        if(enderecos == null){
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }
}

