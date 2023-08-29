public class Fogo {
    private double Temperatura;
    private String Combustivel;
    private String Gases;

    public Fogo (double Temperatura, String Combustivel, String Gases) {
        this.Temperatura = Temperatura;
        this.Combustivel = Combustivel;
        this.Gases = Gases;
    }

    public double getTemperatura() {
        return Temperatura;
    }

    public String getCombustivel() {
        return Combustivel;
    }

    public String getGases() {
        return Gases;
    }

    
}
