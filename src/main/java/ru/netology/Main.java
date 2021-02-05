package ru.netology;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                .addOperand(5)
                .addOperand(15)
                .calculate(Calculator.Operation.MULT)
                .result
        );

        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(0)
                        .calculate(Calculator.Operation.MULT)
                        .result
        );
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(0)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result
        );

        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 0));
        System.out.println(intsCalc.mult(10, 22));
        System.out.println(intsCalc.pow(2, 3));

    }

}
