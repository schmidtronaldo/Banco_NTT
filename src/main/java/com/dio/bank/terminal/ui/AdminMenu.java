package com.dio.bank.terminal.ui;

import java.util.Scanner;

public class AdminMenu {

    public void menuAdministrador(Scanner scanner) {
        boolean executando = true;

        while (executando) {
            System.out.println("\n--- Menu Administrador ---");
            System.out.println("1. Inserir novo cliente");
            System.out.println("2. Ver clientes cadastrados");
            System.out.println("3. Ver informações de um cliente");
            System.out.println("4. Ver logs de movimentações");
            System.out.println("5. Remover cliente");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.println("Cliente " + nome + " inserido com sucesso (simulado).");
                    break;
                case "2":
                    System.out.println("Clientes cadastrados:\n1 - João\n2 - Maria (simulado)");
                    break;
                case "3":
                    System.out.print("ID do cliente: ");
                    String idCliente = scanner.nextLine();
                    System.out.println("Informações do cliente " + idCliente + ":\nNome: João\nConta: 123-4 (simulado)");
                    break;
                case "4":
                    System.out.println("Logs:\n[20/08/2025 10:00] João sacou R$100\n[20/08/2025 11:00] Maria depositou R$200 (simulado)");
                    break;
                case "5":
                    System.out.print("ID do cliente para remoção: ");
                    String idRemocao = scanner.nextLine();
                    System.out.println("Cliente " + idRemocao + " removido (simulado).");
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
