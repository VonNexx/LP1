import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        int[] num = new int[3];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int cont = 0; cont <= 2; cont++){
                System.out.print("Insira a " + (cont + 1) + "º medida: ");
                num[cont] = scanner.nextInt();
            }
            if ((num[0] < (num[1] + num[2])) && (num[1] < (num[0] + num[2])) && (num[2] < (num[0] + num[1]))) {
                System.out.print("As medidas formam um triangulo!");
            } else {
                System.out.print("As medidas não formam um triangulo!");
            }
        }
    }
}