import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            System.out.println("Insira o 1º número:");
            int N1 = Entrada.nextInt();
            System.out.println("Insira o 2º número:");
            int N2 = Entrada.nextInt();
            if (N1 > N2) {
                System.out.println("O maior é o número:" + N1);
            } else {
                System.out.println("O maior é o número:" + N2);
            }
        }
    }
}
