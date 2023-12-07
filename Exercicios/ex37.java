import java.util.Scanner;

public class ex37 {
    public static void main(String[] args) {
        int qtdMorangos, qtdMacas;
        float valorMorango = 0, valorMacas = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insira a quantidade(Kg) de morangos comprados: ");
            qtdMorangos = scanner.nextInt();
            System.out.print("Insira a quantidade(Kg) de maçãs compradas: ");
            qtdMacas = scanner.nextInt();
        }
        if (qtdMorangos <= 5) {
            valorMorango = (float)(qtdMorangos * 2.50);
        } else if (qtdMorangos > 5) {
            valorMorango = (float)(qtdMorangos * 2.20);
        }
        if (qtdMacas <= 5) {
            valorMacas = (float)(qtdMacas * 1.80);
        } else if (qtdMacas > 5) {
            valorMacas = (float)(qtdMacas * 1.50);
        }
        if ((qtdMorangos + qtdMacas > 8) || (valorMorango + valorMacas > 25)) {
            System.out.print("Valor total a ser pago: R$" + ((valorMorango + valorMacas) - ((valorMorango + valorMacas) * 0.1)));
        } else {
            System.out.print("Valor total a ser pago: R$" + (valorMorango + valorMacas));
        }
    }
}
