package ru.netology;

public class IntsCalculator implements Ints {
    private Calculator target;

    public IntsCalculator(){
        this.target = new Calculator();
    }

    public int sum(int arg0, int arg1) throws IllegalStateException{
        return (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
        .result();
    }

    public int mult(int arg0, int arg1) throws IllegalStateException {
        return (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    public int pow(int a, int b) throws IllegalStateException {
        return (int) target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}
