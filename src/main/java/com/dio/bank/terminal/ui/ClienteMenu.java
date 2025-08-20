package com.dio.bank.terminal.ui;

import java.util.Scanner;

public class ClienteMenu {

    public void menuCliente(Scanner scanner) {
        boolean executando = true;

        while (executando) {
            System.out.println("\n--- Menu Cliente ---");
            System.out.println("1. Verificar Saldo");
            System.out.println("2. Ver Extrato");
            System.out.println("3. Sacar");
            System.out.println("4. Depositar");
            System.out.println("5. Transferir");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Saldo atual: R$ 1000.00 (simulado)");
                    break;
                case "2":
                    System.out.println("Extrato:\n- Depósito R$500\n- Saque R$100 (simulado)");
                    break;
                case "3":
                    System.out.print("Valor do saque: ");
                    String saque = scanner.nextLine();
                    System.out.println("Saque de R$" + saque + " realizado (simulado).");
                    break;
                case "4":
                    System.out.print("Valor do depósito: ");
                    String deposito = scanner.nextLine();
                    System.out.println("Depósito de R$" + deposito + " realizado (simulado).");
                    break;
                case "5":
                    System.out.print("Número da conta destino: ");
                    String contaDestino = scanner.nextLine();
                    System.out.print("Valor da transferência: ");
                    String valorTransferencia = scanner.nextLine();
                    System.out.println("Transferência de R$" + valorTransferencia + " para conta " + contaDestino + " realizada (simulado).");
                    break;
                case "0":
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
