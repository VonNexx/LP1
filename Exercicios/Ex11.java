import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            System.out.println("Insira o salário fixo:");
            float Fixo = Entrada.nextFloat();
            System.out.println("Insira a quantidade de carros vendidos:");
            int Carros = Entrada.nextInt();
            System.out.println("Insira o valor por carro vendido:");
            float Valor = Entrada.nextFloat();
            System.out.println("Insira o valor total das vendas:");
            float Vendas = Entrada.nextFloat();
            float Final = Fixo + (Carros*Valor) + (Vendas*5/100);
            System.out.println("O salário final é de: " + Final);
        }
    }
}