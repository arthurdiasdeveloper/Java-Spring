package POO.Praticando.EntregaModel;

public class Endereco {
    public enum TipoEndereco {RESIDENCIAL, TRABAHO, ENTREGA;}
    public String Endereco;
    public String complemento;
    public String bairro;
    public String cep;
    public String numero;

    public TipoEndereco tipo;

};
