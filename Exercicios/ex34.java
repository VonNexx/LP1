import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        String resposta;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insira o valor de X: ");
            int x = scanner.nextInt();
            System.out.print("Insira o valor de Y: ");
            int y = scanner.nextInt();
            int z = ((x*y) + 5);
            if (z <= 0) {
                resposta = "A";
            } else if (z <= 100) {
                resposta = "B";
            } else {
                resposta = "C";
            }
        }
        System.out.print(resposta);
    }
}
