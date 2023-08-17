import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            System.out.println("Insira a temperatura em Fahrenheit:");
            int Fahrenheit = Entrada.nextInt();
            int Celcius = (Fahrenheit-32)/9*5;
            System.out.println("A temperatura em Celcius é: " + Celcius);
        }
    }
}
