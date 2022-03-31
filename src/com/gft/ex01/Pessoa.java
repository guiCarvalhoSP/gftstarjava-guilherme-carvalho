package com.gft.ex01;

public class Pessoa {
    private String nome;
    private String nascimento;
    private float altura;

    private int diaHoje = 31, mesHoje=3, anoHoje=2022;


    public Pessoa(String nome, String nascimento, float altura) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.altura = altura;
    }


    public void imprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getNascimento());
        System.out.println("Altura: " + getAltura());
    }

    public void calcularIdade(){
        String[] data = nascimento.split("/");
        int dia = Integer.parseInt(data[0]);
        int mes = Integer.parseInt(data[1]);
        int ano = Integer.parseInt(data[2]);

        if(mes < mesHoje){
            System.out.println("Sua idade é: " + (anoHoje - ano));
        } else if(mes == mesHoje && dia > diaHoje || mes > mesHoje){
            System.out.println("Sua idade é: " + (anoHoje - ano - 1));
        } else {
            System.out.println("Sua idade é: " + (anoHoje - ano));
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
