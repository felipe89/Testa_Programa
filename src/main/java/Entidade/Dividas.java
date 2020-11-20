package Entidade;

import java.util.Date;

public class Dividas {

    private String nomeConta;
    private double valorConta;
    private Date datavencimentop;

    public Dividas(String nomeConta, double valorConta, Date datavencimentop) {
        this.nomeConta = nomeConta;
        this.valorConta = valorConta;
        this.datavencimentop = datavencimentop;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }

    public Date getDatavencimentop() {
        return datavencimentop;
    }

    public void setDatavencimentop(Date datavencimentop) {
        this.datavencimentop = datavencimentop;
    }
}
