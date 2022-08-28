package Checkpoint;

import java.util.Random;

public class Partida {
    private Equipe anfitriao;
    private  Equipe visitante;
    private  boolean confirmada;

    //*********************Construtor*****************


    public Partida() {
        this.confirmada = false;
    }

    //**************************Getters e Setters*************************


    public Equipe
    getAnfitriao() {
        return anfitriao;
    }

    public void setAnfitriao(Equipe anfitriao) {
        this.anfitriao = anfitriao;
    }

    public Equipe
    getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipe visitante) {
        this.visitante = visitante;
    }

    public boolean getConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    //*********************Métodos*****************

    public void marcarJogo(Equipe anfitriao, Equipe visitante){
        if(!anfitriao.getNome().equals(visitante.getNome())  ){
            setConfirmada(true);
            setAnfitriao(anfitriao);
            setVisitante(visitante);
        }
        else{
            setConfirmada(false);
            setAnfitriao(null);
            setVisitante(null);
        }
    }
    public void jogar(){
        if(getConfirmada()){
            System.out.println("                                      Jogando em casa:");
            getAnfitriao().historia();

            System.out.println("                                         Visitante:");
            getVisitante().historia();
            System.out.println(" ");
//************************Gerar número randomico para mostrar qual será o resultado *******************
            System.out.println("                                         Resultado:");
            System.out.println("                  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            Random aleatorio = new Random();
            int golEmpate = aleatorio.nextInt(3);
            int vencedor = aleatorio.nextInt(3);
            int vencedorPen = aleatorio.nextInt(2);
            int golVencedor = aleatorio.nextInt(3) + 2;
            int golDerrota = aleatorio.nextInt(2);

            switch (vencedor){
                
                case 0:{
                    System.out.println("                               O jogo empatou por " + golEmpate + " X " + golEmpate);
                        this.anfitriao.fazerGol(golEmpate);
                        this.anfitriao.tomarGol(golEmpate);
                        this.visitante.fazerGol(golEmpate);
                        this.visitante.tomarGol(golEmpate);
                    switch (vencedorPen){
                        case 0:{
                            System.out.println("                    " + this.anfitriao.getNome() + " venceu a partida nos penaltis");
                        }
                        break;
                        case 1:{
                            System.out.println("                    " + this.visitante.getNome() + " venceu a partida nos penaltis");
                            
                        }
                        break;
                    }
                }
                break;
                case 1:{
                    System.out.println("                   " + this.anfitriao.getNome() + " venceu a partida por " + golVencedor +" X " + golDerrota);
                    this.anfitriao.fazerGol(golVencedor);
                    this.anfitriao.tomarGol(golDerrota);
                    this.visitante.fazerGol(golDerrota);
                    this.visitante.tomarGol(golVencedor);
                }
                break;
                case 2:{
                    System.out.println("                   " + this.visitante.getNome() + " venceu a partida por " + golVencedor +" X " + golDerrota);
                    this.visitante.fazerGol(golVencedor);
                    this.visitante.tomarGol(golDerrota);
                    this.anfitriao.fazerGol(golDerrota);
                    this.anfitriao.tomarGol(golVencedor);
                }
                break;
            }
            System.out.println("                  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println(" ");
            System.out.println("                  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("                                       Estatisicas do Jogo");
        }
    }
}
