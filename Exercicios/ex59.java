import java.util.Scanner;

public class ex59 {
    public static void main(String[] args) {
        int[] valores = new int[10];
        int negativos = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            for (int cont = 0; cont <= 9; cont++) {
                System.out.print("Insira o " + (cont + 1) + "º valor: ");
                valores[cont] = scanner.nextInt();
                if (valores[cont] < 0) {
                    negativos = negativos + 1;
                }
            }
        }
        System.out.print("Quantidade de valores negativos: " + (negativos));
    }
}
