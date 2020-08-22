package project_oriented_programming.projeto_java_poo;

public class Gerente extends Pessoas{
    private String login;
    private String senha;
    
    public Gerente(String nome, String cpf, String email,String telefone, String endereco,String login,String senha){
        super(nome, cpf, email, telefone);
        this.login = login;
        this.senha = senha;
    }
    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;

    }
}
    
