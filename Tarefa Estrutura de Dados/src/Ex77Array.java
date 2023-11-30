public class Ex77Array {
    public static void main(String[] args) {
        int[] vet = {5, 1, 4, 2, 7, 8, 3, 6};
        int i;
        for (i = 7; i > 4; i--){
            int aux = vet[i];
            vet[i] = vet[7 - i + 1];
            vet[7 - i + 1] = aux;
            System.out.println(vet);
        }
        vet[2] = vet[0];
        vet[vet[2]] = vet[vet[1]];
        System.out.println(vet);
    }
}
