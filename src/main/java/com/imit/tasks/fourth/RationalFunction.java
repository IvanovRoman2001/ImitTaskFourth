package com.imit.tasks.fourth;

public class RationalFunction implements ISingleArgumentFunction {
    double A, B, D, C;
    double right, left;

    public RationalFunction(double a, double b, double c, double d, double left, double right) {
        if (c == 0 && d == 0) throw new IllegalArgumentException("Знаменатель не может равняться нулю");
        A = a;
        B = b;
        D = d;
        C = c;
        this.left = left;
        this.right = right;
    }

    @Override
    public double getValue(double x) throws IllegalArgumentException {
        if (x > right || x < left || C * x + D == 0) throw new IllegalArgumentException();
        return (A * x + B) / (C * x + D);
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
