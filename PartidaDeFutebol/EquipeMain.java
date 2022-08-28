package Checkpoint;

public class EquipeMain {
    public static void main(String[] args) {

        Equipe time[] = new Equipe[4];

        time[0] = new Equipe("São Paulo F.C", 6, 10);
        time[1] = new Equipe("Clube de Regatas Flamengo", 6, 03);
        time[2] = new Equipe("Sport Club Corinthians Paulista", 3, 10);
        time[3] = new Equipe("Fluminense F.C", 4, 0);

        Partida semiJogo1 = new Partida();
        semiJogo1.marcarJogo(time[0], time[1]);
        semiJogo1.jogar();
        time[0].estatisticas();
        time[1].estatisticas();
    }
}
