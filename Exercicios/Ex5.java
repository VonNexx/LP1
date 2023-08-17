import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        try (Scanner Obj = new Scanner(System.in)) {
            System.out.println("Insira um número:");
            int Num = Obj.nextInt() - 1;
            System.out.println("O antecessor é: " + Num);
        }
    }
}
