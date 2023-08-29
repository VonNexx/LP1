public class Madeira {
    private double durabilidade;
    private double degradabilidade;
    private double renovabilidade;

    public Madeira(double durabilidade, double degradabilidade, double renovabilidade) {
        this.durabilidade = durabilidade;
        this.degradabilidade = degradabilidade;
        this.renovabilidade = renovabilidade;
    }

    public double getDurabilidade() {
        return durabilidade;
    }

    public double getDegradabilidade() {
        return degradabilidade;
    }

    public double getRenovabilidade() {
        return renovabilidade;
    }    
}
