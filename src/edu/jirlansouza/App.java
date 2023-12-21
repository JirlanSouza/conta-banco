package edu.jirlansouza;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor, digite o número da Conta!");
        conta.numero =  scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o número da Agência!");
        conta.agencia = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o seu nome!");
        conta.nomeCliente = scanner.next();
        scanner.nextLine();
        System.out.println("Por favor, digite o seu depósito inicial!");
        conta.saldo = scanner.nextDouble();

        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %f45 já está disponível para saque.\n",
            conta.nomeCliente,
            conta.agencia,
            conta.numero,
            conta.saldo
            );

        scanner.close();
    }
}
