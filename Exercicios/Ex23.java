import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            float Peso = 0;
            DecimalFormat Decimal = new DecimalFormat("0.00");
            System.out.print("Insira o seu nome:");
            String Nome = Entrada.next();
            System.out.print("Insira sua altura:");
            float Altura = Entrada.nextFloat();
            int Cont = 0;
            while (Cont == 0) {
                System.out.print("Insira seu sexo: (M ou F)");
                String Sexo = Entrada.next();
                if (Sexo.equals("M")) {
                    Peso = (float) ((72.7 * Altura) - 58);
                    Cont = 1;
                } else if (Sexo.equals("F")) {
                    Peso = (float) ((62.1 * Altura) - 44.7);
                    Cont = 1;
                } else {
                    System.out.println("Sexo invalido.");
                    Cont = 0;
                }
            } System.out.println(Nome + " seu peso ideal é: " + Decimal.format(Peso)); 
        }
    }
}