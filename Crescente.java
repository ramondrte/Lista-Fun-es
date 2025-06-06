import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = sc.nextInt();
        imprimirSequencia(n);
    }

    static void imprimirSequencia(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
