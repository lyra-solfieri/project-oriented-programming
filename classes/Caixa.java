import java.util.Objects;

public class Caixa {
    
    private double vendas;
    private double compras;
    private double saldo;

    public Caixa() {
    }

    public Caixa(double vendas, double compras, double saldo) {
        this.vendas = vendas;
        this.compras = compras;
        this.saldo = saldo;
    }

    public double getVendas() {
        return this.vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getCompras() {
        return this.compras;
    }

    public void setCompras(double compras) {
        this.compras = compras;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Caixa vendas(double vendas) {
        this.vendas = vendas;
        return this;
    }

    public Caixa compras(double compras) {
        this.compras = compras;
        return this;
    }

    public Caixa saldo(double saldo) {
        this.saldo = saldo;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Caixa)) {
            return false;
        }
        Caixa caixa = (Caixa) o;
        return vendas == caixa.vendas && compras == caixa.compras && saldo == caixa.saldo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendas, compras, saldo);
    }

    @Override
    public String toString() {
        return "{" + " vendas='" + getVendas() + "'" + ", compras='" + getCompras() + "'" + ", saldo='" + getSaldo()
                + "'" + "}";
    }
}