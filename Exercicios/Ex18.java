import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            System.out.println("Insira o ano atual:");
            int Atual = Entrada.nextInt();
            System.out.println("Insira o ano de nascimento:");
            int Nascimento = Entrada.nextInt();
            if ((Atual - Nascimento) >= 18) {
                System.out.println("Podera votar este ano.");
            } else {
                System.out.println("Não podera votar este ano.");
            }
        }
    }
}
