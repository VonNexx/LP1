import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        try (Scanner Teclado = new Scanner(System.in)) {
            System.out.println("Insira sua quantidade de anos:");
            int Anos = Teclado.nextInt();
            System.out.println("Insira sua quantidade de meses:");
            int Meses = Teclado.nextInt();
            System.out.println("Insira sua quantidade de dias:");
            int Dias = Teclado.nextInt();
            int Idade_Dias = (Anos * 365) + (Meses * 30) + Dias;
            System.out.println("Sua idade em dias é: " + Idade_Dias);
        }
    }
}
