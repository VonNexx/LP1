import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        String[] times = new String[2];
        int[] gols = new int[2];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int cont = 0; cont <= 1; cont++) {
                System.out.print("Insira o nome do " + (cont+1) + "º time: ");
                times[cont] = scanner.next();
                System.out.print("Insira a quantidade de gols marcados pelo time " + times[cont] + ": ");
                gols[cont] = scanner.nextInt();
                System.out.println("------------------------------");
            }
            if (gols[0] > gols[1]) {
                System.out.print("O time vencedor é o: " + times[0]);
            } else if (gols[1] > gols[0]) {
                System.out.print("O time vencedor é o: " + times[1]);
            } else if (gols[0] == gols[1]) {
                System.out.print("Empate!");
            }
        }
    }
}
