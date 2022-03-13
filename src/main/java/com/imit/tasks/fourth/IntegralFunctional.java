package com.imit.tasks.fourth;

public class IntegralFunctional<T extends ISingleArgumentFunction> implements IFunctional<T> {
    private final double right, left;

    public IntegralFunctional(double left, double right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double calculate(T func) throws IllegalArgumentException {
        if (left < func.getLeft() || right > func.getRight()) throw new IllegalArgumentException();
        int n = 100; //Число равных отрезков
        double result = 0.0;

        double d = Math.abs(right - left) / n; //Шаг разбиения
        for (int i = 0; i < n; i++) {
            result += func.getValue(left + i * d + d / 2) * d;
        }
        return result;
    }
}
