package com.imit.tasks.fourth;

public interface IFunctional<T extends ISingleArgumentFunction> {
    double calculate(T func);
}
