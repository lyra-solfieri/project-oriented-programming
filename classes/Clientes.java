

public class Clientes extends Pessoas{
    private  Endereco endereco;

    public Clientes(String nome, String cpf, String email,String telefone, Endereco endereco){
        super(nome, cpf, email, telefone);
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
   
}