import java.util.Scanner;

public class ex30X {
    public static void main(String[] args) {
        int[] num = new int[3];
        int[] ordem = new int[3];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int cont = 0; cont <= 2; cont++){
                System.out.print("Insira o " + (cont + 1) + "º número: ");
                num[cont] = scanner.nextInt();
            }
            if ((num[0] > num[1]) && (num[0] > num[2])) {
                ordem[0] = num[0];
            } else if ((num[1] > num[0]) && (num[1] > num[2])) {
                ordem[0] = num[1];
            } else if ((num[2] > num[0]) && (num[2] > num[1])) {
                ordem[0] = num[2];
            }
            if ((num[0] > num[1]) && (num[0] < num[2])){
                ordem[1] = num[0];
            }
        }
    }
}
