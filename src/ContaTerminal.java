import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o valor do saldo: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", nomeCliente, agencia, conta, saldo);

        scanner.close();
    }
}
