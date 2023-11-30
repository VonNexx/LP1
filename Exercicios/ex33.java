import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        int[] nums = new int[2];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int cont = 0; cont <= 1; cont++){
                System.out.print("Insira o " + (cont+1) + "º valor: ");
                nums[cont] = scanner.nextInt();
            }
            if (nums[0] > nums[1]) {
                System.out.print("Primeiro é maior.");
            } else if (nums[1] > nums[0]) {
                System.out.print("Segundo é maior.");
            } else if (nums[0] == nums[1]) {
                System.out.print("Números iguais.");
            }
        }

    }
}
