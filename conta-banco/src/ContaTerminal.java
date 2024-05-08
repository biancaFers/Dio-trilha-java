import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // Solicitar informações do usuários
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();//001

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();//Caique Brandão

        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();//1021

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();//1000.00

        // Exibir mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" + saldo + ".");
        System.out.println("Seu saldo já está disponível para saque.");

        

        scanner.close(); // Fechar o scanner
    
        
    }
}