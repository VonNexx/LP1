import java.util.Scanner;

public class Ex80Array {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner (System.in);
        int Q[] = new int[20], Num = -1, Maior = 0, Posição = 0;

        for (int Cont = 0; Cont < 20; Cont++){
            System.out.print("Insira um número positivo: ");
            Num = Entrada.nextInt();
            if (Num < 0) {
                System.out.print("Número invalido. ");
            } else {
                Q[Cont] = Num;
            }
        }
        for (int atual : Q) {
            if(atual > Maior) {
                Maior = atual;
                Posição = Q[atual];
            }
        }
        System.out.print("Maior:" + Maior);
        System.out.print("Posição:" + Posição);
    }
}
