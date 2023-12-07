import java.util.Scanner;

public class ex56 {
    public static void main(String[] args) {
        int valor = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            for (int cont = 1; cont == 1;) {
                System.out.print("Insira um valor inteiro entre 1 e 10: ");
                valor = scanner.nextInt();
                if ((valor <= 0) || (valor > 10)) {
                    cont = 1;
                } else if ((valor >= 1) && (valor <= 10)) {
                    cont = 0;
                }
            }
            for (int cont = 1; cont <= 10; cont++) {
                System.out.println((valor) + " x " + (cont) + " = " + (valor * cont) );
            }   
        }
    }
}
