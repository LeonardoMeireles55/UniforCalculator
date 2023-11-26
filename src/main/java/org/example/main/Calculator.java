package org.example.main;

import org.example.services.InitCalcService;

public class Calculator {
    public static void main(String[] args) {
        InitCalcService initCalcService = new InitCalcService();

        initCalcService.showCalc();
    }
}

