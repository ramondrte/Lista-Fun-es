import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a taxa de imposto (%): ");
        double taxaImposto = sc.nextDouble();
        System.out.print("Digite o custo do item: ");
        double custo = sc.nextDouble();

        double custoFinal = somaImposto(taxaImposto, custo);
        System.out.println("O custo final com imposto é: " + custoFinal);
    }

    static double somaImposto(double taxaImposto, double custo) {
        return custo + (custo * taxaImposto / 100);
    }
}
