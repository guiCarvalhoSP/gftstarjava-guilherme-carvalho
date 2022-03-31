package com.gft.ex03;

public class SucoLimao extends Sucos{

    /**
     * Exercicio apresenta um erro e não demonstra o valor final.
     * Devido ao meu computador ter baixo processamento e estar travando demais, não tive tempo para executar teste e achar os erros.
     * Peço desculpas pelo inconveniente.*/

    private float valorLitro;

    public SucoLimao(float preco, int desconto) {
        setValorLitro(preco);
        setDesconto(desconto);
    }


    @Override
    protected void calculaValor(float litros) {
        float precoFinal;
        precoFinal = valorLitro * litros;

        /*if(litros <= 2){
            precoFinal -= precoFinal * (getDesconto() / 100f);
        }*/

        imprimirPreco(precoFinal);
    }

    @Override
    protected void imprimirPreco(float preco){
        System.out.println("Suco de Limão");
        System.out.println("Preço total: R$" + preco);
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }
}
