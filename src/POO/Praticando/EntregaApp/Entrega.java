package POO.Praticando.EntregaApp;

import POO.Praticando.EntregaModel.Cliente;
import POO.Praticando.EntregaModel.Endereco;

import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;

public class Entrega {
    public static void main(String [] args ){


        Endereco endereco = new Endereco();
        //dados do enderecos
        //caso eu retire o cep, terei uma exception
        endereco.cep = "000000";


        Cliente cliente = new Cliente();
        //dados do cliente



       // if(Cliente.enderecos == null){
         //   Cliente.enderecos = new ArrayList<Endereco>();
        //}

        //o Try e cacth forca a exception.
        try{
            //cliente.getEnderecos().add(endereco);
            //ao invés de utilizar o código acima, agora eu ustilizo o metodo que criei.
            cliente.adicionaEndereco(endereco);
            System.out.println("Endreco addiconaod a cliente com sucesso!");
        }catch (Exception e){
            System.err.println("Houve um erro ao inserir o Endereco: " + e.getMessage());
        }


        //cliente.enderecos.add(endereco);
        //System.out.println("Foi adicionado com sucesso!");
    }
}
