package br.edu.insper.desagil.pi.isail;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String nome;
    private double minimo;
    private List<Lance> lances;

    public Item(String nome, double minimo) {
        this.nome = nome;
        this.minimo = minimo;
        this.lances = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void fazLance(Comprador comprador, double oferta) {
        if (oferta < minimo) {
            return;
        }

        if (!lances.isEmpty()) {
            int maior = indiceDaMaiorOferta();
            if (oferta <= maior) {
                return;
            }
        }

        lances.add(new Lance(comprador, oferta));

        comprador.incrementa();
    }

    public void imprimeMelhorLance() {
        if (lances.isEmpty()) {
            System.out.println("Nenhum lance foi feito ainda!");
        } else {
            int maior = indiceDaMaiorOferta();
            lances.get(maior).imprimeInformacoes();
        }
    }

    private int indiceDaMaiorOferta() {
        int maior = 0;
        for (int i = 1; i < lances.size(); i++) {
            if (lances.get(maior).getOferta() < lances.get(i).getOferta()) {
                maior = i;
            }
        }
        return maior;
    }
}
