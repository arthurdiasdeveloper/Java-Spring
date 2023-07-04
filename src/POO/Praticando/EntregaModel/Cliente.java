package POO.Praticando.EntregaModel;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public String nome;
    public String cpf;
    public int telefone;
    private static List<Endereco>  enderecos;
    //com o privete o meu atributo fica protegido e náo è acessivel na classe main


    //public void setEnderecos(List<Endereco> enderecos){
    //  this.enderecos = enderecos;
    //  }
    // nao deixarei o metodo set porque queremos adicinar manualmente os enderecos.

    public static List<Endereco> getEnderecos(){
        if(enderecos == null){
           enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }
}
