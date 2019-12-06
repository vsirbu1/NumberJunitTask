package com.inteship.task.number;

import jdk.nashorn.internal.objects.Global;

import static java.lang.Double.NaN;
import static jdk.nashorn.internal.objects.Global.Infinity;

public class OperationsOnNumbers {
    public double multiply(double firstNumber, double secondNumber) {
        if (firstNumber <= 0 || firstNumber > 100 || secondNumber < 0 || secondNumber > 100) {
            return 0;
        } else
            return firstNumber * secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        if (firstNumber < 0 || secondNumber < 0 || firstNumber < secondNumber) {
            return -1;
        } else
            return firstNumber - secondNumber;
    }

    public double divide(double numberToBeDivided, double divisor) {
        if(Double.isNaN(numberToBeDivided/divisor)){
            throw new NumberFormatException("NaN format result");
        }
        if(Double.isInfinite(numberToBeDivided/divisor)){
            throw new ArithmeticException("Divide by 0");
        }
        if (numberToBeDivided < 0 || divisor < 0 || numberToBeDivided < divisor) {
            return 0;
        } else
            return numberToBeDivided / divisor;
    }
}
