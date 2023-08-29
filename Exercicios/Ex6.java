import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            System.out.println("Insira a Base:");
            int Base = Entrada.nextInt();
            System.out.println("Insira a Altura:");
            int Altura = Entrada.nextInt();
            int Area = Base * Altura;
            System.out.println("Area do retangulo: " + Area + " m2");
        }
    }
}
