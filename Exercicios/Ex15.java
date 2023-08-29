import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            System.out.println("Insira um número:");
            float Num = Entrada.nextFloat();
            if (Num < 0) {
                System.out.println("O valor é negativo.");
            } else {
                System.out.println("O valor é positivo.");
            }
        }
    }
}
