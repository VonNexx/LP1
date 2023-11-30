import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insira um número: ");
            int num = scanner.nextInt();
            if (num > 0) {
                System.out.print("O valor é positivo!");
            } else if (num < 0) {
                System.out.print("O valor é negativo!");
            } else {
                System.out.print("O valor é 0!");
            }
        }
    }
}
