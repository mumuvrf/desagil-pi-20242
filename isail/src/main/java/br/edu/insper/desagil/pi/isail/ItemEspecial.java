package br.edu.insper.desagil.pi.isail;

public class ItemEspecial extends Item {
    public ItemEspecial(String nome, double minimo) {
        super(nome, minimo);
    }

    @Override
    public void fazLance(Comprador comprador, double oferta) {
        if (oferta >= 1000000) {
            super.fazLance(comprador, oferta);
        }
    }
}
