package Entidade;

public class ProdutoExercicio {

    private String nome;
    private Double preço;

    public ProdutoExercicio(String nome, Double preço) {
        this.nome = nome;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    @Override
    public String toString() {
        return nome + ", " + String.format("%.2f", preço);
    }
}
