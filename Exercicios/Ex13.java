import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            System.out.println("Insira a 1º nota:");
            float N1 = Entrada.nextFloat();
            System.out.println("Insira a 2º nota:");
            float N2 = Entrada.nextFloat();
            System.out.println("Insira a 3º nota:");
            float N3 = Entrada.nextFloat();
            float Média = ((N1*2) + (N2*3) + (N3*5))/10;
            System.out.println("A média final é: " + Média);
        }
    }
}
