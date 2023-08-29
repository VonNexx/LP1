public class Ar {
    private double Densidade;
    private double Pressão;
    private double Umidade;

    public Ar (double Densidade, double Pressão, double Umidade) {
        this.Densidade = Densidade;
        this.Pressão = Pressão;
        this.Umidade = Umidade;
    }

    public double getDensidade() {
        return Densidade;
    }

    public double getPressão() {
        return Pressão;
    }

    public double getUmidade() {
        return Umidade;
    }  
}
