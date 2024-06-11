import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta");
        double conta = scanner.nextDouble();
        System.out.println("Por favor, digite o número da Agência");
        double agencia = scanner.nextDouble();
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        int saldo = 20000;

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
         + agencia + ", conta " + conta + " e seu saldo "
         + saldo + " já está disponível para saque");
    }
}
