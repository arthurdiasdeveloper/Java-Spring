package POO.Praticando.EntregaModel;

import java.util.List;

public class Cliente {
    public String nome;
    public String cpf;
    public int telefone;
    private static List<Endereco>  enderecos;
    //com o privete o meu atributo fica protegido e náo è acessivel na classe main


    pbulic void setEnderecos(List<Endereco> enderecos){
        this.enderecos = enderecos;
    }

    public List<Endereco> getEnderecos(){
        return enderecos;
    }
}
