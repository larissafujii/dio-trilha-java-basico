import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Importar a classe scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o usuário

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome completo:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o valor do saldo da conta:");
        double saldo = scanner.nextDouble();   

        // Obter pela scanner os valores digitados pelo usuário no terminal
        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero +
                " e seu saldo " + saldo + " já está disponível para saque");

        // Exibir a mensagem de conta criada

        scanner.close();
    }
}
