package com.imit.tasks.fourth;

public class SinFunction implements  ISingleArgumentFunction {
    double A, B;
    double right, left;

    public SinFunction(double a, double b, double left, double right) {
        A = a;
        B = b;
        this.left = left;
        this.right = right;
    }

    @Override
    public double getValue(double x) throws IllegalArgumentException {
        if (x > right || x < left) throw new IllegalArgumentException();

        return A * Math.sin(B * x);
    }

    @Override
    public double getRight() {
        return right;
    }

    @Override
    public double getLeft() {
        return left;
    }
}
