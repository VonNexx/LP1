public class Gelo {
    private double Densidade;
    private double Fusão;
    private double Expansão;

    public Gelo (double Densidade, double Fusão, double Expansão) {
        this.Densidade = Densidade;
        this.Fusão = Fusão;
        this.Expansão = Expansão;
    }

    public double getDensidade() {
        return Densidade;
    }

    public double getFusão() {
        return Fusão;
    }

    public double getExpansão() {
        return Expansão;
    }
}
