import java.util.Scanner;

public class ex35x {
    public static void main(String[] args) {
        String tipoCombustivel;
        int litrosVendidos;
        Double valorPago = 0.0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insira o tipo de combustivel (A-álcool | G-gasolina): ");
            tipoCombustivel = scanner.next();
            System.out.print("Insira a quantidade de litros vendidos: ");
            litrosVendidos = scanner.nextInt();
            if ((tipoCombustivel == "A") && (litrosVendidos <= 20)) {
                valorPago = ((2.90 * 0.03) * litrosVendidos);
            } else if ((tipoCombustivel == "A") && (litrosVendidos > 20)) {
                valorPago = (2.90 * 0.05) * litrosVendidos;
            } else if ((tipoCombustivel == "G") && (litrosVendidos <= 20)) {
                valorPago = (3.30 * 0.04) * litrosVendidos;
            } else if ((tipoCombustivel == "G") && (litrosVendidos > 20)) {
                valorPago = (3.30 * 0.06) * litrosVendidos;
            } System.out.print("O valor total a ser pago pelo cliente é de R$" + valorPago);
        }
    }
}
