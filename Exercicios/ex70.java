import java.util.Scanner;

public class ex70 {
    public static void main(String[] args) {
        int valor, maior, menor;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insira o 1º valor: ");
            valor = scanner.nextInt();
            maior = valor; menor = valor;
            for (int cont = 2; cont <= 100; cont++) {
                System.out.print("Insira o " + (cont) + "º valor: ");
                valor = scanner.nextInt();
                if (valor > maior) {
                    maior = valor;
                } else if (valor < menor) {
                    menor = valor;
                }
            }
        }
        System.out.println("Maior valor lido = " + (maior));
        System.out.print("Menor valor lido = " + (menor));
    }
}
