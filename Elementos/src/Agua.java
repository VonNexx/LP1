public class Agua {
    private double temperatura;
    private double densidade;
    private double solubilidade;

    public Agua (double temperatura, double densidade, double solubilidade) {
        this.temperatura = temperatura;
        this.densidade = densidade;
        this.solubilidade = solubilidade;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getDensidade() {
        return densidade;
    }

    public double getSolubilidade() {
        return solubilidade;
    }
}
