import java.util.ArrayList;
import java.util.Scanner;

public class ex78List {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            ArrayList lista = new ArrayList<>();
            for (int Cont = 1; Cont <= 10; Cont++){
                System.out.print("Insira o " + Cont + "º nome:");
                lista.add(Entrada.next());
            }
            System.out.print("Buscar nome:");
            String nome = Entrada.next();
            if (lista.contains(nome)) {
                System.out.print("ACHEI");
            } else {
                System.out.print("NÃO ACHEI");
            }
        }
    }
}