import java.util.ArrayList;


public class Banco {


    private String nome;


    //private ArrayList <ClientePF> clientesPF;
    //private ArrayList <ClientePJ> clientesPJ;


    private ArrayList <Cliente> clientes;


    public Banco(String nome){
        this.nome = nome;
        //this.clientesPF = new ArrayList<>();
        //this.clientesPJ = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }


    /*public ArrayList<ClientePF> getClientesPF(){
        return this.clientes;
    }
    public void setClientePF(ClientePF clientePF){
        clientesPF.add(clientePF);
    }
    public ArrayList<ClientePJ> getClientesPJ(){
        return this.clientesPJ;
    }
    public void setClientePJ(ClientePJ clientePJ){
        clientesPJ.add(clientePJ);
    }*/


    public ArrayList<Cliente> getClientes(){
        return this.clientes;
    }
    public void adicionaCliente(Cliente cliente){
        this.clientes.add(cliente);
    }


    //Atividade Aula - filtrar apenas os pj dessa lista


    public ArrayList<Cliente> getClientesPJ(){
     
        ArrayList<Cliente> listapj = new ArrayList<>();
        for(Cliente item : this.clientes){
       
            if(item instanceof ClientePJ){
                listapj.add(item);
            }
        }
        return listapj;
    }
    public ArrayList<Cliente> getClientesPF(){
     
        ArrayList<Cliente> listapf = new ArrayList<>();
        for(Cliente item : this.clientes){
       
            if(item instanceof ClientePF){
                listapf.add(item);
            }
        }
        return listapf;
    }






   
}
