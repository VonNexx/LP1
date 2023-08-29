public class Eletricidade {
    private double Tensão;
    private double Corrente;
    private double Resistência;

    public Eletricidade (double Tensão, double Corrente, double Resistência) {
        this.Tensão = Tensão;
        this.Corrente = Corrente;
        this.Resistência = Resistência;
    }

    public double getTensão() {
        return Tensão;
    }

    public double getCorrente() {
        return Corrente;
    }

    public double getResistência() {
        return Resistência;
    }
}
