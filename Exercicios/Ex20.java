import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            System.out.println("Insira o 1º número:");
            int N1 = Entrada.nextInt();
            System.out.println("Insira o 2º número:");
            int N2 = Entrada.nextInt();
            if (N1 > N2) {
                System.out.println("Ordem crescente:" + N2 +", "+ N1);
            } else {
                System.out.println("Ordem crescente:" + N1 +", "+ N2);
            }
        }
    }
}
