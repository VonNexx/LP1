public class TesteElementos {
    public static void main(String[] args) throws Exception {
        Agua agua = new Agua(30, 995, 1);
        System.out.println("A agua está a uma temperatura de " + agua.getTemperatura() + " °C");
        Ar ar = new Ar(1225, 1, 50);
        System.out.println("O Ar está com a pressão em " + ar.getPressão() + " atm");
        Eletricidade eletricidade = new Eletricidade(75, 25, 3);
        System.out.println("A tensão desta corrente elétrica é de " + eletricidade.getTensão() + " Voltz");
        Fogo fogo = new Fogo(70, "Madeira", "CO2");
        System.out.println("O combustivel deste fogo é " + fogo.getCombustivel());
        Gelo gelo = new Gelo(2000, 32, 500);
        System.out.println("O ponto de fusão do gelo é de " + gelo.getFusão() + " °C");
        Gravidade gravidade = new Gravidade(50, 50, 1);
        System.out.println("A força da gravidade é de " + gravidade.getForça());
        Madeira madeira = new Madeira(30, 40, 50);
        System.out.println("A degradabilidade da madeira é de " + madeira.getDegradabilidade());
        Metal metal = new Metal(10, 20, 30);
        System.out.println("A condutividade termica deste metal é de " + metal.getCondutividadeTermica());
        Natureza natureza = new Natureza(70, 80, 100);
        System.out.println("A biodiversidade desta natureza é de " + natureza.getBiodiversidade());
        Terra terra = new Terra(20, "calcario", true);
        System.out.println("O mineral presente nesta terra é o " + terra.getMineral());
    }
}
