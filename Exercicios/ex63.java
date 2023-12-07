import java.util.Scanner;

public class ex63 {
    public static void main(String[] args) {
        int numero = 0, soma = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            for (int cont = 1; cont <= 10; cont++) {
                System.out.print("Insira o " + (cont) + "º número: ");
                numero = scanner.nextInt();
                soma = soma + numero;
            }
            System.out.print("Soma total = " + (soma));
        }
    }
}
