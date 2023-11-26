package org.example.services;

import org.example.enums.Sign;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class InitCalcService {
    private final CalculatorService calculatorService = new CalculatorService();

    public void showCalc() {
        System.out.println("Olá meus friends!");
        Scanner scanner = new Scanner(System.in);
        String menu = "1";
        while (menu.equals("1")) {
            System.out.println("Digite o primeiro numero:");
            double x = scanner.nextDouble();
            System.out.println("Digite o segundo numero:");
            double y = scanner.nextDouble();
            System.out.println("Escolha uma operação: SUM, MINUS, MULTIPLY, DIVISION, MODULUS");
            scanner.nextLine();
            String operator = scanner.nextLine();
            System.out.println(calculatorService.operation(Sign.valueOf(operator), x, y));
            System.out.println("Resultado em memoria ---> " + calculatorService.getMemory());
            System.out.println("Digite 1 para continuar ou 0 para encerrar:");
            menu = scanner.nextLine();
        }
    }
}