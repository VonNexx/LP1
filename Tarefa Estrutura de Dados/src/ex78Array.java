import java.util.Scanner;

public class ex78Array {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            String[] nomes = new String[10];
            for (int Cont = 0; Cont < 10; Cont++){
                System.out.print("Insira o " + (Cont + 1) + "º nome:");
                nomes[Cont] = Entrada.next();
            }
            System.out.print("Buscar nome:");
            String buscarNome = Entrada.next();
            for (String nome : nomes){
                if (buscarNome.equals(nome)){
                    boolean encontrado = true;
                    if (encontrado = true) {
                        System.out.print("ACHEI");
                    }
                } else {
                    boolean encontrado = false;
                    if (encontrado = false) {
                        System.out.print("NÃO ACHEI");
                    }
                }
                
            }
        }
    }
}