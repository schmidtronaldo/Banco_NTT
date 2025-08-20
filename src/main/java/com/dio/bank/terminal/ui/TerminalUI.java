package com.dio.bank.terminal.ui;

import java.util.Scanner;

public class TerminalUI {

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n=== BANCO DIO - TERMINAL ===");
            System.out.println("1. Cliente");
            System.out.println("2. Administrador");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    new ClienteMenu().menuCliente(scanner);
                    break;
                case "2":
                    new AdminMenu().menuAdministrador(scanner);
                    break;
                case "0":
                    System.out.println("Encerrando o terminal...");
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
