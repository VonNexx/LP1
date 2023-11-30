import java.util.Scanner;

public class ex36x {
    public static void main(String[] args) {
        int[] homens = new int[2];
        int[] mulheres = new int[2];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int cont = 0; cont <= 1; cont++) {
                System.out.print("Insira a idade do " + (cont+1) + "º homem: ");
                homens[cont] = scanner.nextInt();
            }
            for (int cont = 0; cont <= 1; cont++) {
                System.out.print("Insira a idade da " + (cont+1) + "º mulher: ");
                mulheres[cont] = scanner.nextInt();
            }
            if (homens[0] > homens[1]) {
                
            }
        }

    }
}