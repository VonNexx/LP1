import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Insira o estoque atual: ");
            int atual = entrada.nextInt();
            System.out.print("Insira o estoque máximo: ");
            int máximo = entrada.nextInt();
            System.out.print("Insira o estoque mínimo: ");
            int mínimo = entrada.nextInt();
            int média = (máximo + mínimo) / 2;
            System.out.println("Estoque médio: " + média);
            if (atual >= média) {
                System.out.println("Não efetuar compra.");
            } else {
                System.out.println("Efetuar compra.");
            }
        }
    }
}