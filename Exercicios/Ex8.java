import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            DecimalFormat Decimal = new DecimalFormat("0.0");
            System.out.println("Insira a quantidade de votos válidos:");
            float Validos = Entrada.nextInt();
            System.out.println("Insira a quantidade de votos nulos:");
            float Nulos = Entrada.nextInt();
            System.out.println("Insira a quantidade de votos em branco:");
            float Brancos = Entrada.nextInt();
            float Total = Validos + Nulos + Brancos;
            System.out.println("Do total de " + Total*1 + " votos");
            System.out.println(Decimal.format(Validos*100/Total) + "% foram válidos.");
            System.out.println(Decimal.format(Nulos*100/Total) + "% foram nulos.");
            System.out.println(Decimal.format(Brancos*100/Total) + "% foram brancos.");
        }
    }
}
