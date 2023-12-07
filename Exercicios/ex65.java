import java.util.Scanner;

public class ex65 {
    public static void main(String[] args) {
        int[] valores = new int[2];
        int soma = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            for (int cont1 = 0; cont1 <= 1; cont1++) {
                System.out.print("Insira o " + (cont1+1) + "º valor: ");
                valores[cont1] = scanner.nextInt();
            }
        }
        for (int cont2 = valores[0]; cont2 <= valores[1]; cont2++) {
            soma = soma + cont2;
        }
        System.out.print("Soma total = " + (soma));
    }
}
