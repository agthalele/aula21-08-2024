import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){


        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Nome do Banco: ");
        String nomebanco = teclado.nextLine( );

        Banco banco = new Banco(nomebanco);


        System.out.println("Nome: ");
        String nome = teclado.nextLine( );


        System.out.println("Cpf: ");
        String cpf = teclado.nextLine( );  


        ClientePF clientepf = new ClientePF(nome, cpf);
        banco.adicionaCliente(clientepf);


        //fariamos a mesma coisa para juridica
        System.out.println("Empresa: ");
        String empresa = teclado.nextLine( );


        System.out.println("Cnpj: ");
        String cnpj = teclado.nextLine( );


        ClientePJ clientecnpj = new ClientePJ(empresa, cnpj);
        banco.adicionaCliente(clientecnpj);


       ArrayList<Cliente> listaDeClientes = banco.getClientes();

        System.out.println("\n\t"+nomebanco);
       for(int i = 0; i< listaDeClientes.size(); i++){
 
        System.out.println("-------------------------------");
       
        Cliente item = listaDeClientes.get(i);
        if(item instanceof ClientePF){
            System.out.println("Nome: ");
        }
        else{ System.out.println("Empresa: "); }


        System.out.println(item.getNome());
        System.out.println(item.getDocumento());


        System.out.println("-------------------------------");
       }




       teclado.close();


    }
}
