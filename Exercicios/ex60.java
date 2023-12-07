import java.util.Scanner;

public class ex60 {
    public static void main(String[] args) {
        int[] valores = new int[10];
        int dentro = 0, fora = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            for (int cont = 0; cont <= 9; cont++) {
                System.out.print("Insira o " + (cont + 1) + "º valor: ");
                valores[cont] = scanner.nextInt();
                if ((valores[cont] >= 10) && (valores[cont] <= 20)) {
                    dentro = dentro + 1;
                } else if ((valores[cont] < 10) || (valores[cont] > 20)) {
                    fora = fora + 1;
                }
            }
        }
        System.out.println("Valores dentro do intervalo: " + (dentro));
        System.out.print("Valores fora do intervalo: " + (fora));
    }
}
