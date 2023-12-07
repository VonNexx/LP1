import java.util.Scanner;

public class ex41 {
    public static void main(String[] args) {
        float[] notas = new float[3];
        float mediaExercicios, mediaAproveitamento;
        try (Scanner scanner = new Scanner(System.in)) {
            for (int cont = 0; cont <= 2; cont++) {
                System.out.print("Insira a " + (cont + 1) + "º nota: ");
                notas[cont] = scanner.nextFloat();
            }
            System.out.print("Insira a média dos exercicios: ");
            mediaExercicios = scanner.nextFloat();
            mediaAproveitamento = ((notas[0] + (notas[1] * 2) + (notas[2] * 3) + mediaExercicios) / 7);
        }
        if (mediaAproveitamento >= 9) {
            System.out.print("Conceito: A");
        } else if ((mediaAproveitamento >= 7.5) && (mediaAproveitamento < 9)) {
            System.out.print("Conceito: B");
        } else if ((mediaAproveitamento >= 6) && (mediaAproveitamento < 7.5)) {
            System.out.print("Conceito: C");
        } else if (mediaAproveitamento < 6) {
            System.out.print("Conceito: D");
        }

    }
}
