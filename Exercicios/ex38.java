import java.util.Scanner;

public class ex38 {
    public static void main(String[] args) {
        int usuario = 1234, senha = 9999, entrada;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insira o código de usuario: ");
            entrada = scanner.nextInt();
            if (entrada == usuario) {
                System.out.print("Insira a senha: ");
                entrada = scanner.nextInt();
                if (entrada == senha) {
                    System.out.print("Acesso permitido.");
                } else {
                    System.out.print("Senha incorreta.");
                }
            } else {
                System.out.print("Código de usuario incorreto.");
            }
        }
    }
}
