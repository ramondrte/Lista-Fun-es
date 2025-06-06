import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        char resultado = verificaSinal(numero);
        System.out.println("Resultado: " + resultado);
    }

    static char verificaSinal(int num) {
        if (num > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }
}
