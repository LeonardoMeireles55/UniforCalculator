package org.example.services;

import org.example.enums.Sign;

import java.util.Scanner;

public class InitCalcService {
    private final CalculatorService calculatorService = new CalculatorService();

    public void menu() {
        int opcao = 0;
        while (opcao != 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha as opções: 1 - Porcentagem, 2 - Calculadora Simples, 3 - Sair");
            opcao = scanner.nextInt();
            if (opcao == 1) {
                percentage();
            } else if (opcao == 2) {
                showCalc();
            } else if (opcao == 3) {
                scanner.close();
            } else {
                System.out.println("Opcão inválida, tente novamente.");
                scanner.close();
            }
        }
    }

    public void percentage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Percentagem");
        System.out.println("Digite o valor: ");
        double x = scanner.nextDouble();
        System.out.println("Digite o valor da porcentagem:");
        double y = scanner.nextDouble();

        System.out.println(y + "%" + " de " + x + " é: " + (x * y / 100));
    }
    public void showCalc() {
        Scanner scanner = new Scanner(System.in);
        String menu = "1";
        while (menu.equals("1")) {
            System.out.println("Digite o primeiro número:");
            double x = scanner.nextDouble();
            System.out.println("Digite o segundo número:");
            double y = scanner.nextDouble();
            System.out.println("Escolha uma das operações: SUM, MINUS, MULTIPLY, DIVISION, MODULUS, POWER, ROOT");
            scanner.nextLine();
            String operator = scanner.nextLine().toUpperCase();
            System.out.println(calculatorService.operation(Sign.valueOf(operator), x, y));

            System.out.println("Resultado em memoria é:" + calculatorService.getMemory());
            System.out.println("Digite  o numero 1 para continuar ou 0 para encerrar:");
            menu = scanner.nextLine();
        }
    }
}