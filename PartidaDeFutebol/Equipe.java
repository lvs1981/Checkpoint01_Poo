package Checkpoint;
public  class Equipe implements AcoesDaEquipe{
    private String nome;
    private int golsPro;
    private int golsContra;
    private int saldoDeGols;


    //****************************Construtor******************************

    public Equipe(String nome) {
        this.nome = nome;
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

    //***************************Metodos************************

    public void apresentar(){
        System.out.println("                          ++++++++++++++++++++++++++++++++++++++");
        System.out.println("                           Equipe: " + getNome());
        System.out.println("                          ++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
    }
    
    
    public void estatisticas(){
        System.out.println("                                        "+ getNome());
        System.out.println("                                        Gols pro: " + getGolsPro());
        System.out.println("                                        Gols contra: " + getGolsContra());
        System.out.println("                                        Saldo de gols: " + getSaldoDeGols());
        System.out.println(" ");
    }

    @Override
    public int fazerGol(int golP) {
         setGolsPro(getGolsPro() + golP);
         return getGolsPro();
    }

    @Override
    public int sofrerGol(int golC) {
    setGolsContra(getGolsContra() + golC);
    return getGolsContra();
    }


}
