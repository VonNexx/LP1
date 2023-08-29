import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            System.out.println("Insira um número:");
            int Num = Entrada.nextInt() - 1;
            System.out.println("O antecessor é: " + Num);
        }
    }
}
