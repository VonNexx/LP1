import java.util.Scanner;

public class ex61 {
    public static void main(String[] args) {
        int[] valores = new int[10];
        int mediaAritmetica = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            for (int cont = 0; cont <= 9; cont++) {
                System.out.print("Insira o " + (cont+1) + "º valor: ");
                valores[cont] = scanner.nextInt();
                mediaAritmetica = mediaAritmetica + valores[cont];
            }
        }
        System.out.print("Média Aritmética: " + (mediaAritmetica / 10));
    }
}
