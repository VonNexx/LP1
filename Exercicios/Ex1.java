public class Ex1 {
    public static void main(String[] args) {
        int A = 10, B = 20;
        System.out.println(A);
        System.out.println(B);
        System.out.println("---");
        int C = A;
        A = B;
        B = C;
        System.out.println(A);
        System.out.println(B);
    }
}