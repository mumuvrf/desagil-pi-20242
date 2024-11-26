package br.edu.insper.desagil.pi.insee;

public abstract class Referencia {
    private String observacao;

    public Referencia() {
        this.observacao = "";
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public abstract int comoInteiro();
}
