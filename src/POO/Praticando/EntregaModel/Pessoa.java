package POO.Praticando.EntregaModel;

public class Pessoa {
    //nos sabemos que o cpf possui 11 nùmeros, mas e sempre legal documentarmos
    //isso em forma de código. para isso usamos a seguinte variavel statica.
    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    public enum TipoPessoa {FISICA, JURIDICA  }

    public String nome;
    private String documento;
    public String telefone;
    public TipoPessoa tipo;


    public String getDocumento(){
        return documento;
    }
    public void SetDocumento(String documento){
        if(documento == null || documento.isEmpty()){
            throw new RuntimeException("O documento náo pode ser nulo nem vazio!");
        }
        if(documento.length() == TAMANHO_CPF){
            //tipo = TipoPessoa.FISICA;
            setDocumento(documento, tipo = TipoPessoa.FISICA);
        } else if (documento.length() == TAMANHO_CNPJ ){
            //tipo = TipoPessoa.JURIDICA; ao invés disso, porque criei o segundo set privado, irei usar isso, abaixo:
            setDocumento(documento, tipo = TipoPessoa.JURIDICA);
        } else {
            throw new RuntimeException("Documento inválido para pessoa fisica ou juridica!");
        }
        //this.documento = documento;
    }

    private void setDocumento(String documento, TipoPessoa tipo){
        this.documento = documento;
        this.tipo = tipo;

    }

    public TipoPessoa getTipo() {
        return tipo;
    }
};
