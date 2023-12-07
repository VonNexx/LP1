import java.util.Scanner;

public class ex43 {
    public static void main(String[] args) {
        int[] lados = new int[3];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int cont = 0; cont <= 2; cont++) {
                System.out.print("Insira o " + (cont+1) + "º lado: ");
                lados[cont] = scanner.nextInt();
            }
            if ((lados[0] < (lados[1] + lados[2])) && (lados[1] < (lados[0] + lados[2])) && (lados[2] < (lados[0] + lados[1]))){
               if ((lados[0] == lados[1]) && (lados[1] == lados[2])) {
                    System.out.print("Triangulo Equilatero.");
               } else if ((lados[0] == lados[1]) || (lados[1] == lados[2]) || (lados[0] == lados[2])) {
                    System.out.print("Triangulo Isósceles");
               } else {
                    System.out.print("Triangulo Escaleno");
               }
            } else {
                System.out.print("Não é possivel formar um triângulo.");
            }
        }
    }
}
