import java.util.Scanner;

public class ex68 {
    public static void main(String[] args) {
        int qtdMercadorias;
        float valorTotal = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insira a quantidade de mercadorias: ");
            qtdMercadorias = scanner.nextInt();
            for (int cont = 1; cont <= qtdMercadorias; cont++) {
                System.out.print("Insira o valor da " + (cont) + "º mercadoria: R$");
                valorTotal = (valorTotal + scanner.nextFloat());
            }
        }
        System.out.println("Valor total em estoque: R$" + (valorTotal));
        System.out.print("Média do valor das mercadorias: R$" + (valorTotal / qtdMercadorias));
    }
}
