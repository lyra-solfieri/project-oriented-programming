package project_oriented_programming.projeto_java_poo;

public class Funcionario extends Pessoas{
    private String codigo;
    private String senha;

    public Funcionario(String nome, String cpf, String email,String telefone,String codigo,String senha){
        super(nome, cpf, email, telefone);
        this.codigo = codigo;
        this.senha = senha;

    }

    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;

    }
    
}   