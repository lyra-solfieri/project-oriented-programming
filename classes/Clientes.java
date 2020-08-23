

public class Clientes extends Pessoas{
    private String endereco;

    public Clientes(String nome, String cpf, String email,String telefone, String endereco){
        super(nome, cpf, email, telefone);
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
   
}