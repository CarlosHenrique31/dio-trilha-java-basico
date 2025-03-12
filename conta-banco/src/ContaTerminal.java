import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO:Conhecer e importar a classe Scanner

        //Exibir as mensagens para noso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite as informações abaixo: ");

        System.out.print("\n");

        System.out.println("Digite nome do proprietário da conta !");
        String nome = scanner.nextLine();

        System.out.println("Digite o numero da sua conta !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Digite seu saldo !");
        double saldo = scanner.nextDouble();

        System.out.print("\n");

        System.out.println("------------------");
        System.out.println("Ola, " + nome);
        System.out.println("------------------");
        System.out.println("Conta: " + numero);
        System.out.println("Agencia: " + agencia);
        System.out.println("Saldo: " + saldo);
        System.out.println("------------------");

    }
}