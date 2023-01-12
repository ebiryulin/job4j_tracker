package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);
        int rslMinus = Calculator.minus(5);
        System.out.println(rslMinus);
        Calculator calculatorDivide = new Calculator();
        int rslDivide = calculatorDivide.divide(10);
        System.out.println(rslDivide);
        Calculator calculatorSumAll = new Calculator();
        int rslSumAll = calculatorSumAll.sumAllOperation(5);
        System.out.println(rslSumAll);
    }
}
