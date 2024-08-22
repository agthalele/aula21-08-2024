public class ClientePF extends Cliente{
   
    private String cpf;


    public ClientePF(String nome, String cpf){
        super(nome);
        this.cpf = cpf;
    }


    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }


    @Override
    public String getDocumento() {
       return cpf;
    }


   


}
