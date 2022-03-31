package com.gft.ex03;

public abstract class Sucos {


    private int desconto;

    protected abstract void calculaValor(float litros);
    protected abstract void imprimirPreco(float preco);

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

}
