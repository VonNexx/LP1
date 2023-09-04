import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            System.out.println("Insira a quantidade de horas trabalhadas no mês:");
            int Horas = Entrada.nextInt();
            System.out.println("Insira o salário por hora:");
            int Salario = Entrada.nextInt();
            if ((Horas / 4) > 40) {
                float Extras = (float) ((Horas - 40)*(0.50 * Salario));
                Salario += Extras;
                System.out.println("O salario total é de:" + Salario);
            } else {
                Salario = (Salario*Horas);
                System.out.println("O salario total é de:" + Salario);
            }
        }
    }
}