import java.util.Scanner;

public class Horario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite a hora (0-23): ");
            int hora = sc.nextInt();
            System.out.print("Digite os minutos (0-59): ");
            int minutos = sc.nextInt();

            char periodo;
            int horaConvertida = converterHora(hora);
            if (hora >= 12) {
                periodo = 'P';
            } else {
                periodo = 'A';
            }

            exibirHora(horaConvertida, minutos, periodo);

            System.out.print("Deseja converter outro horário? (S/N): ");
            continuar = sc.next().toUpperCase().charAt(0);
        } while (continuar == 'S');
    }

    static int converterHora(int hora) {
        if (hora == 0) {
            return 12;
        } else if (hora > 12) {
            return hora - 12;
        } else {
            return hora;
        }
    }

    static void exibirHora(int hora, int minutos, char periodo) {
        String periodoExtenso = (periodo == 'A') ? "A.M." : "P.M.";
        System.out.printf("Hora convertida: %d:%02d %s\n", hora, minutos, periodoExtenso);
    }
}
