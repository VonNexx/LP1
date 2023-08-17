import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        try (Scanner Teclado = new Scanner(System.in)) {
            System.out.println("Insira a Base:");
            int Base = Teclado.nextInt();
            System.out.println("Insira a Altura:");
            int Altura = Teclado.nextInt();
            int Area = Base * Altura;
            System.out.println("Area do retangulo: " + Area + " m2");
        }
    }
}
