import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            float Custo;
            DecimalFormat Decimal = new DecimalFormat("0.00");
            System.out.println("Insira a quantidade de maçãs compradas:");
            int Qtd = Entrada.nextInt();
            if (Qtd < 12) {
                Custo = (float) (Qtd * 1.30);
            } else {
                Custo = Qtd * 1;
            }
            System.out.println("O custo total foi de: R$" + Decimal.format(Custo));
        }
        
    }
}
