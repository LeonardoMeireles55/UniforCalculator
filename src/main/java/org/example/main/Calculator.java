package org.example.main;

import org.example.services.CalculatorService;
import org.example.services.InitCalcService;

public class Calculator {
    //Joana
    public static String loading() {
        return "Loading... please wait!\n";
    }
    public static void main(String[] args) {
        System.out.println(Calculator.loading());
        InitCalcService initCalcService = new InitCalcService();

        initCalcService.menu();
    }
}

