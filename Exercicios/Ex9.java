import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            System.out.println("Insira o valor do seu salário:");
            float Salario = Entrada.nextFloat();
            System.out.println("Insira o percentual de reajuste:");
            float Reajuste = Entrada.nextFloat();
            Salario += Salario*Reajuste/100;
            System.out.println("O novo salário é de: " + Salario);
        }
    }
}
