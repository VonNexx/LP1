import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            float Comissão;
            System.out.println("Insira o salário fixo:");
            float Fixo = Entrada.nextFloat();
            System.out.println("Insira o valor das vendas:");
            float Vendas = Entrada.nextFloat();
            if (Vendas > 1500) {
                Comissão = (float) (((Vendas - 1500)* 0.05) + (1500 * 0.03));
            } else {
                Comissão = (float) (Vendas * 0.03);
            }
            float Salario = Fixo + Comissão;
            System.out.println("O saláiro total é de R$" + Salario);
        }
    }
}
