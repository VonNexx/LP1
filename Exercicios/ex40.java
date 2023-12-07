import java.util.Scanner;

public class ex40 {
    public static void main(String[] args) {
        String produto; int quantidade; float preço;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insira o nome do produto: ");
            produto = scanner.next();
            System.out.print("Insira a quantidade adiquirida: ");
            quantidade = scanner.nextInt();
            System.out.print("Insira o preço unitario do produto: ");
            preço = scanner.nextFloat();
            System.out.println("--------------------");
            System.out.println("       " + produto);
            System.out.println("Preço original: R$" + (quantidade * preço));
        } if (quantidade <= 5) {
            System.out.println("Desconto adquirido: " + 2 + "%");
            System.out.print("Total a pagar: R$" + ((quantidade * preço) - ((quantidade * preço) * 0.02)));
        } else if ((quantidade > 5) && (quantidade <=10)) {
            System.out.println("Desconto adquirido: " + 3 + "%");
            System.out.print("Total a pagar: R$" + ((quantidade * preço) - ((quantidade * preço) * 0.03)));
        } else if (quantidade > 10) {
            System.out.println("Desconto adquirido: " + 5 + "%");
            System.out.print("Total a pagar: R$" + ((quantidade * preço) - ((quantidade * preço) * 0.05)));
        }
    }
}
