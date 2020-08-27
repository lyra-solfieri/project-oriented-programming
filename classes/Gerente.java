import java.util.Objects;

public class Gerente extends Pessoas {

    private String login;
    private String senha;
    private final String LOGIN = "adm";
    private final String SENHA = "adm";

    public Gerente() {
    }

    public String getLOGIN() {
        return this.LOGIN;
    }

    public String getSENHA() {
        return this.SENHA;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Gerente)) {
            return false;
        }
        Gerente gerente = (Gerente) o;
        return Objects.equals(LOGIN, gerente.LOGIN) && Objects.equals(SENHA, gerente.SENHA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(LOGIN, SENHA);
    }

    @Override
    public String toString() {
        return "{" + " LOGIN='" + getLOGIN() + "'" + ", SENHA='" + getSENHA() + "'" + "}";
    }
}