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

    public void adicionaEndereco(Endereco endereco){
        if(endereco == null){
            throw new NullPointerException("O Enderecço não pode ser nulo!");
        }

        if(endereco.cep == null){
            throw new NullPointerException("O cep náo pode ser nulo!");
        }
        //se eu passar por todas as validacoes
        getEnderecos().add(endereco);
    }
    //agora irei colocar o metodo get como privado para obrigar
    //a utilização do metodo adiconaEndereco
    private static List<Endereco> getEnderecos(){
        if(enderecos == null){
           enderecos = new ArrayList<Endereco>();
           //aqui estamos verificando se o atributo endereção não é nulo
            // se ele não for nulo ele adiciona um endereço
        }
        return enderecos;
    }
}
