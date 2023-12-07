import java.util.Scanner;

public class ex49 {
    public static void main(String[] args) {
        float a1 = 0, a2 = 0; String resposta;
        try (Scanner scanner = new Scanner(System.in)) {
            for (int cont = 1; cont ==1;) {
                for (int cont1 = 1; cont1 == 1;) {
                    System.out.print("Insira a nota da 1º avaliação: ");
                    a1 = scanner.nextFloat();
                    if ((a1 >= 0) && (a1 <= 10)) {
                        cont1 = 0;
                    } else {
                        cont1 = 1;
                    }
                }
                for (int cont2 = 1; cont2 == 1;) {
                    System.out.print("Insira a nota da 2º avaliação: ");
                    a2 = scanner.nextFloat();
                    if ((a2 >= 0) && (a2 <= 10)) {
                        cont2 = 0;
                    } else {
                        cont2 = 1;
                    }
                }
                System.out.println("Média simples do aluno = " + ((a1 + a2) / 2));
                System.out.print("Deseja fazer outro calculo? (S/N): ");
                resposta = scanner.next();
                if (resposta.equals("S")) {
                    cont = 1;
                } else if (resposta.equals("N")) {
                    cont = 0;
                }
            }
        }
    }
}
