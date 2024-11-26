package br.edu.insper.desagil.pi.isail;

import java.time.LocalDateTime;

public class Lance {
    private LocalDateTime momento;
    private Comprador comprador;
    private double oferta;

    public Lance(Comprador comprador, double oferta) {
        this.momento = LocalDateTime.now();
        this.comprador = comprador;
        this.oferta = oferta;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public double getOferta() {
        return oferta;
    }

    public void imprimeInformacoes() {
        System.out.println(comprador + " ofereceu " + oferta + " (" + momento.toString() + ")");
    }
}
