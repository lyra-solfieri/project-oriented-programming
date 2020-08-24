import java.util.Objects;

abstract class Endereco {
    private String rua;
    private String bairro;
    private int numero;

    public Endereco() {
    }

    public Endereco(String rua, String bairro, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Endereco rua(String rua) {
        this.rua = rua;
        return this;
    }

    public Endereco bairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public Endereco numero(int numero) {
        this.numero = numero;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Endereco)) {
            return false;
        }
        Endereco endereco = (Endereco) o;
        return Objects.equals(rua, endereco.rua) && Objects.equals(bairro, endereco.bairro)
                && numero == endereco.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rua, bairro, numero);
    }

    @Override
    public String toString() {
        return "{" + " rua='" + getRua() + "'" + ", bairro='" + getBairro() + "'" + ", numero='" + getNumero() + "'"
                + "}";
    }

}