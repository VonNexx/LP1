import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            System.out.println("Insira sua quantidade de anos:");
            int Anos = Entrada.nextInt();
            System.out.println("Insira sua quantidade de meses:");
            int Meses = Entrada.nextInt();
            System.out.println("Insira sua quantidade de dias:");
            int Dias = Entrada.nextInt();
            int Idade_Dias = (Anos * 365) + (Meses * 30) + Dias;
            System.out.println("Sua idade em dias é: " + Idade_Dias);
        }
    }
}
