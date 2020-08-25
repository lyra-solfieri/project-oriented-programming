import java.util.Objects;

public class Gerente extends Pessoas {
   
    private String login;
    private String senha;

    public Gerente(String nome, String cpf, String email, String telefone, String endereco, String login,
            String senha) {
        super(nome, cpf, email, telefone);
        this.login = login;
        this.senha = senha;
    }

    

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Gerente login(String login) {
        this.login = login;
        return this;
    }

    public Gerente senha(String senha) {
        this.senha = senha;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Gerente)) {
            return false;
        }
        Gerente gerente = (Gerente) o;
        return Objects.equals(login, gerente.login) && Objects.equals(senha, gerente.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, senha);
    }

    @Override
    public String toString() {
        return "{" +
            " login='" + getLogin() + "'" +
            ", senha='" + getSenha() + "'" +
            "}";
    }
}
