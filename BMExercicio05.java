public class BMExercicio05 {
    private String nomeTime;
    private String nomeTecnico;
    private int mostraJogos;
    private int placar;

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nome) {
        this.nomeTime = nome;
    }

    public String getNomeTecnico() {
        return nomeTecnico;
    }

    public void setNomeTecnico(String tecnico) {
        this.nomeTecnico = tecnico;
    }

    public int getMostraJogos() {
        return mostraJogos;
    }

    public void setMostraJogos(int pontos) {
        this.mostraJogos = pontos;
    }

    public int getMostraPlacar() {
        return placar;
    }

    public void setMostraPlacar(int valor) {
        this.placar = valor;
    }

    int atualizaGols(int golsMarcados, int golsTomados){
        int resultado = golsMarcados - golsTomados;
        return placar + resultado;
    }

    int atualizarMostraJogos(){
        return mostraJogos++;
    }

}