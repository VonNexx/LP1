import java.util.Scanner;

public class ex62 {
    public static void main(String[] args) {
        int alunos;
        float notaAluno = 0, mediaAritmetica = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insira a quantidade de alunos: ");
            alunos = scanner.nextInt();
            for (int cont = 1; cont <= alunos; cont++) {
                System.out.print("Insira a nota do " + (cont) + "º aluno: ");
                notaAluno = scanner.nextFloat();
                mediaAritmetica = mediaAritmetica + notaAluno;
            }
            System.out.print("Média Aritmética = " + (mediaAritmetica / alunos));
        }
        
    }
}
