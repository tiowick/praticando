package Direct_5;

public class pessoa {
    // tamanho do cpf e cnpj para validar
    private static final  int  TAMANHO_CPF = 11;
    private static final  int  TAMANHO_CNPJ = 14;
    //quem tem cpf é pessoa fisica e quem tem cnpj é pessoa juridica!!
    public enum TipoPessoa {FISICA, JURIDICA}

    public Integer codigo;
    public String nome;
    private String documento;
    public TipoPessoa tipo;

    // poliformismo
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento == null || documento.isEmpty()){
            throw new RuntimeException("Documento não pode ser nulo ou vazio!!");
        }
        // para o documento se não for vazio
        if (documento.length() == TAMANHO_CPF){
            setDocumento(documento, TipoPessoa.FISICA);  // se for pessoa fisica
        }else if (documento.length() == TAMANHO_CNPJ) {
            setDocumento(documento, TipoPessoa.JURIDICA);  // se for pessoa juridica
        } else{
            throw new RuntimeException("Documento invalido para pessoa fisica ou juridica!!");
        }
        //this.documento = documento;

    }
    // privado
    private void setDocumento(String documento, TipoPessoa tipo) {
        this.documento = documento;
        this.tipo = tipo;

    }
    public TipoPessoa getTipo() {
        return tipo;
    }
}
