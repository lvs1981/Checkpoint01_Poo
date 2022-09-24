package Checkpoint;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //************Gerar número randomico para mostrar gol do Jogador********************
        Random golPorJogador = new Random();

        //***************instancias*************************

        Equipe time[] = new Equipe[2];
        Jogador jog[] = new Jogador[2];

        time[0] = new Equipe("São Paulo F.C");
        time[1] = new Equipe("Clube de Regatas Flamengo");
        jog[0] = new Jogador("Calleri", "");
        jog[1] = new Jogador("Gabriel", "");

        Partida semiJogo1 = new Partida();
        semiJogo1.marcarJogo(time[0], time[1]);
        semiJogo1.jogar();
        time[0].estatisticas();
        time[1].estatisticas();

        time[0].setGolsPro(golPorJogador.nextInt(time[0].getGolsPro()));
        time[1].setGolsPro(golPorJogador.nextInt(time[1].getGolsPro()));

        System.out.println(" ");
        System.out.println("                                     O jogador " + jog[0].getNomeJogador() + " fez " + time[0].getGolsPro() + " gols na partida");
        System.out.println("                                     O jogador " + jog[1].getNomeJogador() + " fez " + time[1].getGolsPro() + " gols na partida");

    }
}
