import java.util.Objects;

public class Estoque {

    private Produtos[] prateleiras;



    public Estoque() {
    }
    

    public Estoque(Produtos[] prateleiras) {
        this.prateleiras = prateleiras;
    }

    public Produtos[] getPrateleiras() {
        return this.prateleiras;
    }

    public void setPrateleiras(Produtos[] prateleiras) {
        this.prateleiras = prateleiras;
    }

    public Estoque prateleiras(Produtos[] prateleiras) {
        this.prateleiras = prateleiras;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Estoque)) {
            return false;
        }
        Estoque estoque = (Estoque) o;
        return Objects.equals(prateleiras, estoque.prateleiras);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(prateleiras);
    }

    @Override
    public String toString() {
        return "{" +
            " prateleiras='" + getPrateleiras() + "'" +
            "}";
    }


}