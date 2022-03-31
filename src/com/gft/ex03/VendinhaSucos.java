package com.gft.ex03;

public class VendinhaSucos {

    private float precoLimao, precoTamarindo;
    private int descontoLimao, descontoTamarindo1, descontoTamarindo2;

    public VendinhaSucos(float precoLimao, float precoTamarindo, int descontoLimao, int descontoTamarindo1, int descontoTamarindo2) {
        System.out.println(precoLimao);
        setPrecoLimao(precoLimao);
        setDescontoLimao(descontoLimao);
        setPrecoTamarindo(precoTamarindo);
        setDescontoTamarindo1(descontoTamarindo1);
        setDescontoTamarindo2(descontoTamarindo2);
    }

    SucoLimao sucoLimao = new SucoLimao(precoLimao, descontoLimao);

    public void fazerVenda(String tipoSuco, float qtdLitros){
        switch(tipoSuco){
            case "L":
                sucoLimao.calculaValor(qtdLitros);
                break;
            case "T":
                break;
            default:
                System.out.println("Valor inválido, tente novamente");
        }
    }


    public float getPrecoLimao() {
        return precoLimao;
    }

    public void setPrecoLimao(float precoLimao) {
        this.precoLimao = precoLimao;
    }

    public float getPrecoTamarindo() {
        return precoTamarindo;
    }

    public void setPrecoTamarindo(float precoTamarindo) {
        this.precoTamarindo = precoTamarindo;
    }

    public int getDescontoLimao() {
        return descontoLimao;
    }

    public void setDescontoLimao(int descontoLimao) {
        this.descontoLimao = descontoLimao;
    }

    public int getDescontoTamarindo1() {
        return descontoTamarindo1;
    }

    public void setDescontoTamarindo1(int descontoTamarindo1) {
        this.descontoTamarindo1 = descontoTamarindo1;
    }

    public int getDescontoTamarindo2() {
        return descontoTamarindo2;
    }

    public void setDescontoTamarindo2(int descontoTamarindo2) {
        this.descontoTamarindo2 = descontoTamarindo2;
    }
}
