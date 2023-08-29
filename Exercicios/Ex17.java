import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            System.out.println("Insira a nota da 1º prova:");
            float N1 = Entrada.nextFloat();
            System.out.println("Insira a nota da 2º prova:");
            float N2 = Entrada.nextFloat();
            float Média = (N1 + N2) / 2;
            System.out.println("Média:" + Média);
            if (Média >= 6) {
                System.out.println("Aluno Aprovado");
            } else {
                System.out.println("Aluno Reprovado");
            }
        }
    }
}
