import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: conhecer e importar a classe Scanner

        // exebir as mensagens para o nosso usuário

        // obter pela scanner os valores digitais no terminal

        // exibir a mensagem no terminal
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Por favor, dite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, dite o número da Agencia: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Por favor, dite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Qual valor do deposito?");
        int saldo = scanner.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldo + "R$"
                + " já está disponível para saque!");
    }
}
