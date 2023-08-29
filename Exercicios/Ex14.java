import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        try (Scanner Entrada = new Scanner(System.in)) {
            System.out.println("Insira um número:");
            int Num = Entrada.nextInt();
            if (Num > 10){
                System.out.println("É MAIOR QUE 10!");
            } else {
                System.out.println("NÃO É MAIOR QUE 10!");
            }
        }
    }
}
