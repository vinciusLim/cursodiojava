package projeto;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digitar numero");
        int numero = scanner.nextInt();
        System.out.println("Digitar agencia");
        String agencia = scanner.next();
        System.out.println("Digitar nome do cliente");
        String nomeCliente = scanner.next();
        System.out.println("Digitar saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
