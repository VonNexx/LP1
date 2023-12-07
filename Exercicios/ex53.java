import java.util.Scanner;

public class ex53 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insira o valor de N: ");
            int N = scanner.nextInt();
            for (int cont = 1; cont <= N; cont++) {
                System.out.println(cont);
            }   
        }
    }
}
