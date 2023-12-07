import java.util.Scanner;

public class ex69 {
    public static void main(String[] args) {
        int qtdMercadorias = 0;
        float valorTotal = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            for (int cont = 1; cont > 0; cont++) {
                System.out.print("Insira o valor da " + (cont) + "º mercadoria: R$");
                valorTotal = (valorTotal + scanner.nextFloat());
                qtdMercadorias = (qtdMercadorias + 1);
                System.out.print("Mais mercadorias? (S/N): ");
                String resposta = scanner.next();
                if (resposta.equals("S")) {
                    continue;
                } else if (resposta.equals("N")) {
                    cont = -1;
                }
            }
        }
        System.out.println("Valor total em estoque: R$" + (valorTotal));
        System.out.print("Média do valor das mercadorias: R$" + (valorTotal / qtdMercadorias));
    }
}
