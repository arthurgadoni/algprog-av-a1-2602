
import java.util.Locale;
import java.util.Scanner;

public class Prova_A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Qual o nome da commodity: ");
        String commodity = sc.nextLine();

        System.out.print("E qual é sua cotação atual: ");
        double cotacao_atual = sc.nextDouble();

        System.out.print("Agora diga-me a perda estimada de safra: ");
        int perda = sc.nextInt();

        if (perda < 0 || perda > 100) {
            System.out.println("ERRO DETECTADO: Percentual de safra perdida invalido!");
        } else {
            double cotacao_projetada = cotacao_atual + (perda * 0.10);

            System.out.printf("O Commodity: %s | A Cotação Atual: US$ %.2f%n",
                    commodity, cotacao_atual);

            System.out.printf("A Cotação Projetada: US$ %.2f%n",
                    cotacao_projetada);

            if (perda > 15 && cotacao_atual > 50.00) {
                System.out.println(
                    "ALERTA DE RISCO: Alta volatilidade no mercado!");
            }
        }

        sc.close();
    }
}
