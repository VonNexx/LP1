import java.util.Scanner;

public class ex45 {
    public static void main(String[] args) {
        float cont = 1, valor1 = 0, valor2 = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insira o 1º valor: ");
            valor1 = scanner.nextInt();
            while (cont == 1) {
                System.out.print("Insira o 2º valor: ");
                valor2 = scanner.nextInt();
                if (valor2 == 0) {
                    cont = 1;
                } else {
                    cont = 0;
                }
            }
        }
        System.out.print("Resultado da divisão: " + (valor1 / valor2));
    }
}
