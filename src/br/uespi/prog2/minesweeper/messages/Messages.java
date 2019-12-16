package br.uespi.prog2.minesweeper.messages;

public class Messages {

    private String phrase;

    public void welcome() {
        this.phrase = "Bem vindo ao campo minado!";
        System.out.println(this.phrase);
    }

    public void writeName() {
        this.phrase = "Digite seu nome: ";
        System.out.println(this.phrase);
    }

    public void writeDimension() {
        this.phrase = "Digite o tamanho do tabuleiro(Min: 8x8)";
        System.out.println(this.phrase);
    }

    public void writeDimensionInvalid() {
        this.phrase = "Tamanho do tabuleiro inválido! (Min: 8x8)";
        System.out.println(this.phrase);
    }
    public void writeAction(){
        this.phrase = "Selecione uma das ações abaixo: \n 1 - Revelar \n 2 - Marcar \n 3 - Revelar";
    }
}
