public class Metal {
    private double dureza;
    private double condutividadeTermica;
    private double condutividadeEletrica;
    
    public Metal(double dureza, double condutividadeTermica, double condutividadeEletrica) {
        this.dureza = dureza;
        this.condutividadeTermica = condutividadeTermica;
        this.condutividadeEletrica = condutividadeEletrica;
    }

    public double getDureza() {
        return dureza;
    }

    public double getCondutividadeTermica() {
        return condutividadeTermica;
    }

    public double getCondutividadeEletrica() {
        return condutividadeEletrica;
    }    
}
