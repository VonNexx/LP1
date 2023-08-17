import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            System.out.println("Insira o custo de fabrica do carro:");
            float Fabrica = Entrada.nextFloat();
            float Consumidor = Fabrica + (Fabrica*73/100);
            System.out.println("O custo ao consumidor será de:" + Consumidor);
        }
    }
}
