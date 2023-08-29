public class Terra {
    private double umidade;
    private String mineral;
    private boolean fertilidade;

    public Terra(double umidade, String mineral, boolean fertilidade) {
        this.umidade = umidade;
        this.mineral = mineral;
        this.fertilidade = fertilidade;
    }
    public double getUmidade() {
        return umidade;
    }
    public String getMineral() {
        return mineral;
    }
    public boolean isFertilidade() {
        return fertilidade;
    }
}
