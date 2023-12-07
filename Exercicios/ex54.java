import java.util.Scanner;

public class ex54 {
    public static void main(String[] args) {
        int N = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            for (int cont = 1; cont == 1;) {
                System.out.print("Insira o valor de N: ");
                N = scanner.nextInt();
                if (N <= 0) {
                    cont = 1;
                } else if (N > 0) {
                    cont = 0;
                }
            }
            for (int cont = 1; cont <= N; cont++) {
                System.out.println(cont);
            }   
        }
    }
}
