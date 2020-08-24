import java.util.Objects;

public class Clientes extends Pessoas {
    private Endereco endereco;

    public Clientes(String nome, String cpf, String email, String telefone, Endereco endereco) {
        super(nome, cpf, email, telefone);
        this.endereco = endereco;
    }

    public Clientes() {
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Clientes endereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Clientes)) {
            return false;
        }
        Clientes clientes = (Clientes) o;
        return Objects.equals(endereco, clientes.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(endereco);
    }

    @Override
    public String toString() {
        return "{" + " endereco='" + getEndereco() + "'" + "}";
    }

}