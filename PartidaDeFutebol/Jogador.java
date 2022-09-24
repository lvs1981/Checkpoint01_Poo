package Checkpoint;


public  class Jogador extends Equipe{
    private String nomeJogador;

    //****************Construtor****************************
    public Jogador(String nomeJogador, String nome) {
        super(nome);
        this.nomeJogador = nomeJogador;
    }
    //************Getters e Setters********************
    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

}