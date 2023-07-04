package POO.Praticando.EntregaApp;

import POO.Praticando.EntregaModel.Cliente;
import POO.Praticando.EntregaModel.Endereco;

import java.util.ArrayList;

public class Entrega {
    public static void main(String [] args ){


        Endereco endereco = new Endereco();
        //dados do enderecos


        Cliente cliente = new Cliente();
        //dados do cliente
        if(Cliente.enderecos == null){
            Cliente.enderecos = new ArrayList<Endereco>();
        }

        //Cliente.enderecos.add(endereco);
    }
}
