package Calulator;

public class Calculator {
    public Double add(double a, double b) {
        return a + b;
    }

    public Double substract(double a, double b) {
        return a - b;
    }

    public Double multiply(double a, double b) {
        return a * b;
    }

    public Double divide(double a, double b) {
        return a / b;
    }

    public Double root(double a) {
        if (a < 0) {
            throw new RootException();
        }
        return Math.sqrt(a);
    }
}
