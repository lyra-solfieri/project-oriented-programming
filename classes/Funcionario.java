import java.util.Objects;

public class Funcionario extends Pessoas {
    private String codigo;
    private String senha;

    public Funcionario(String nome, String cpf, String email, String telefone, String codigo, String senha) {
        super(nome, cpf, email, telefone);
        this.codigo = codigo;
        this.senha = senha;

    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Funcionario codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public Funcionario senha(String senha) {
        this.senha = senha;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Funcionario)) {
            return false;
        }
        Funcionario funcionario = (Funcionario) o;
        return Objects.equals(codigo, funcionario.codigo) && Objects.equals(senha, funcionario.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, senha);
    }

    @Override
    public String toString() {
        return "{" + " codigo='" + getCodigo() + "'" + ", senha='" + getSenha() + "'" + "}";
    }

}