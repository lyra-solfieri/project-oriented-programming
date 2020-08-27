import java.util.Objects;

public class Clientes extends Pessoas {

    private Endereco e;

    public Clientes() {
    }

    public Clientes(String nome, String cpf, String email, String telefone, Endereco e) {
        super(nome, cpf, email, telefone);
        this.e = e;
    }

    public Endereco getE() {
        return this.e;
    }

    public void setE(Endereco e) {
        this.e = e;
    }

    public Clientes e(Endereco e) {
        this.e = e;
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
        return Objects.equals(e, clientes.e);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(e);
    }

    @Override
    public String toString() {

        return "{" + " nome='" + getNome() + "'" + ", cpf='" + getCpf() + "'" + ", email='" + getEmail() + "'"
                + ", telefone='" + getTelefone() + "'" + " e='" + getE() + "'" + "}";
    }

}
