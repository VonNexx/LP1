import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
        int[] homens = new int[2];
        int[] mulheres = new int[2];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int cont = 0; cont <= 1; cont++) {
                System.out.print("Insira a idade do " + (cont+1) + "º homem: ");
                homens[cont] = scanner.nextInt();
            }
            for (int cont = 0; cont <= 1; cont++) {
                System.out.print("Insira a idade da " + (cont+1) + "º mulher: ");
                mulheres[cont] = scanner.nextInt();
            }
            if ((homens[0] > homens[1]) && (mulheres[0] > mulheres[1])) {
                System.out.println("Soma das idades mais velho e mais nova: " + (homens[0]+mulheres[1]));
                System.out.print("Produto das idades mais novo e mais velha: " + (homens[1]*mulheres[0]));
            } else if ((homens[1] > homens[0]) && (mulheres[1] > mulheres[0])) {
                System.out.println("Soma das idades mais velho e mais nova: " + (homens[1]+mulheres[0]));
                System.out.print("Produto das idades mais novo e mais velha: " + (homens[0]*mulheres[1]));
            } else if ((homens[0] > homens[1]) && (mulheres[1] > mulheres[0])) {
                System.out.println("Soma das idades mais velho e mais nova: " + (homens[0]+mulheres[0]));
                System.out.print("Produto das idades mais novo e mais velha: " + (homens[1]*mulheres[1]));
            } else if ((homens[1] > homens[0]) && (mulheres[0] > mulheres[1])) {
                System.out.println("Soma das idades mais velho e mais nova: " + (homens[1]+mulheres[1]));
                System.out.print("Produto das idades mais novo e mais velha: " + (homens[0]*mulheres[0]));
            }
        }
    }
}
