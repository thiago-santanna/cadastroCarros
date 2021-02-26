public class Carro {
    private String nome;
    private Integer numPortas;
    private String numChassi;
    private String anoFabricacao;
    private Combustiveis combutivel;
    private Cores cor;

    public Cores getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", numPortas=" + numPortas +
                ", numChassi='" + numChassi + '\'' +
                ", anoFabricacao='" + anoFabricacao + '\'' +
                ", combutivel=" + combutivel +
                ", cor=" + cor +
                '}';
    }

    public void setCor(Cores cor) {
        this.cor = cor;
    }

    public Carro(String nome, Integer numPortas, String numChassi, String anoFabricacao, Combustiveis combutivel) {
        this.nome = nome;
        this.numPortas = numPortas;
        this.numChassi = numChassi;
        this.anoFabricacao = anoFabricacao;
        this.combutivel = combutivel;
    }
}
