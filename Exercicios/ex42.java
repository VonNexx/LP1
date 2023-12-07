import java.util.Scanner;

public class ex42 {
    public static void main(String[] args) {
        int codigo, anoNascimento, anoEmpresa, idade, tempoEmpresa;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insira o código de empregado: ");
            codigo = scanner.nextInt();
            System.out.print("Insira o ano de nascimento: ");
            anoNascimento = scanner.nextInt();
            System.out.print("Insira o ano de ingresso na empresa: ");
            anoEmpresa = scanner.nextInt();
        }
        System.out.println("--------------------");
        idade = (2023 - anoNascimento);
        tempoEmpresa = (2023 - anoEmpresa);
        System.out.println("Idade: " + idade);
        System.out.println("Tempo no trabalho: " + tempoEmpresa);
        if (idade >= 65) {
            System.out.print("Requerer aposentadoria.");
        } else if (tempoEmpresa >= 30) {
            System.out.print("Requerer aposentadoria.");
        } else if ((idade >= 60) && (tempoEmpresa >= 25)) {
            System.out.print("Requerer aposentadoria.");
        } else {
            System.out.print("Não requerer aposentadoria.");
        }
    }
}
