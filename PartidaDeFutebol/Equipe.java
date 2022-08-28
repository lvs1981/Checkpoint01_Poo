package Checkpoint;
public class Equipe implements AcoesDaEquipe{
    private String nome;
    private  int titulosNac;
    private  int titulosIntern;

    private int golsPro;
    private int golsContra;
    private int saldoDeGols;


    //****************************Construtor******************************


    public Equipe(String nome, int titulosNac, int titulosIntern) {
        this.nome = nome;
        this.titulosNac = titulosNac;
        this.titulosIntern = titulosIntern;
        setGolsPro(this.golsPro);
        setGolsContra(this.golsContra);
        this.saldoDeGols = 0;
    }



    //********************************Setters e Getters ***********************


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTitulosNac() {
        return titulosNac;
    }

    public void setTitulosNac(int titulosNac) {
        this.titulosNac = titulosNac;
    }

    public int getTitulosIntern() {
        return titulosIntern;
    }

    public void setTitulosIntern(int titulosIntern) {
        this.titulosIntern = titulosIntern;
    }

    public int getGolsPro() {
        return golsPro;
    }

    public void setGolsPro(int golsPro) {
        this.golsPro = golsPro;
        setSaldoDeGols();
    }

    public int getGolsContra() {
        return golsContra;
    }

    public void setGolsContra(int golsContra) {
        this.golsContra = golsContra;
        setSaldoDeGols();
    }

    public int getSaldoDeGols() {
        return saldoDeGols;
    }

    public void setSaldoDeGols() {
        this.saldoDeGols = getGolsPro() - getGolsContra();
    }

    public void historia(){
        System.out.println("                          ++++++++++++++++++++++++++++++++++++++");
        System.out.println("                           Equipe: " + getNome());
        System.out.println("                           Conquistas");
        System.out.println("                           Titulos Nacionais: " + getTitulosNac());
        System.out.println("                           Títulos Internacionais: " + getTitulosIntern());
        System.out.println("                          ++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
    }
    
    
    public void estatisticas(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("                                        "+ getNome());
        System.out.println("                                        Gols pro: " + getGolsPro());
        System.out.println("                                        Gols contra: " + getGolsContra());
        System.out.println("                                        Saldo de gols: " + getSaldoDeGols());
        System.out.println(" ");
    }

    @Override
    public void fazerGol(int golP) {
        setGolsPro(getGolsPro() + golP);
    }

    @Override
    public void tomarGol(int golC) {
    setGolsContra(getGolsContra() + golC);
    }



    //******************Métodos abstratos***********************



}
