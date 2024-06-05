import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da conta: ");
        int numero = 1021;

        System.out.print("Digite o número da Agência: ");
        String agencia = "067-8";
        
        System.out.print("Digite o nome do cliente: ");
        String cliente = "MARIO ANDRADE";

        double saldo = 237.48;

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saodo " + saldo + " já está disponível para saque.");
    }
}
