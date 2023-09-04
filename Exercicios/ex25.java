import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Insira o número da conta:");
            int conta = entrada.nextInt();
            System.out.println("Insira o saldo da conta:");
            float saldo = entrada.nextFloat();
            System.out.println("Insira o débito da conta:");
            float débito = entrada.nextFloat();
            System.out.println("Insira o crédito da conta:");
            float crédito = entrada.nextFloat();
            float saldoAtual = (saldo - débito + crédito);
            System.out.println("----------");
            if (saldoAtual >= 0) {
                System.out.println("Conta:" + conta + "\nSaldo Positivo: " + saldoAtual);
            } else if (saldoAtual < 0) {
                System.out.println("Conta:" + conta + "\nSalto Negativo: " + saldoAtual);
            } System.out.println("----------");
        }
    }
}
