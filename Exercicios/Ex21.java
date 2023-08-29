import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            int Tempo;
            System.out.println("Insira a hora de inicio do jogo:");
            int Inicio = Entrada.nextInt();
            System.out.println("Insira a hora de término do jogo:");
            int Fim = Entrada.nextInt();
            if (Fim > Inicio) {
                Tempo = Fim - Inicio;
            } else {
                Tempo = Inicio - Fim;
            } System.out.println("O tempo de jogo foi de "+ Tempo +" horas");
        }
    }
}
