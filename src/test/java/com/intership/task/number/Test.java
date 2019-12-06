package com.intership.task.number;

import com.inteship.task.number.OperationsOnNumbers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.MatcherAssert.*;
import org.hamcrest.core.IsEqual;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;



import static org.hamcrest.CoreMatchers.is;

import static java.util.function.Predicate.isEqual;

public class Test {
    @ParameterizedTest
    @CsvSource({"0.1,100,10","0.5,20.5,10.25","1.2,50.25,60.3","1,10.0,10.0","24.4,36.2,883.28"})
    public void multiplying(double fn,double ln, double res) throws InterruptedException {
        OperationsOnNumbers num = new OperationsOnNumbers();
        MatcherAssert.assertThat(num.multiply(fn,ln), is(res));
    }
    @ParameterizedTest
    @CsvSource({"2.5,0.5,5.0","68.265,20.5,3.33","51.69,3.0,17.23","10,10.0,1.0","24,8,3.0"})
    public void dividing(double fn,double ln, double res) throws InterruptedException {
        OperationsOnNumbers num = new OperationsOnNumbers();
        MatcherAssert.assertThat(num.divide(fn,ln), is(res));
    }
    @ParameterizedTest
    @CsvSource({"2,1,1","55,15,40","100,99,1","50,11,39","65,3,62"})
    public void substructing(int fn,int ln, int res) throws InterruptedException {
        OperationsOnNumbers num = new OperationsOnNumbers();
        MatcherAssert.assertThat(num.subtract(fn,ln), is(res));
    }
    @ParameterizedTest
    @CsvSource({"0,100,0","-1,20.5,0","1.2,-5,0","111,10.0,0","0,1111,0"})
    public void multiplyingNegative(double fn,double ln, double res) throws InterruptedException {
        OperationsOnNumbers num = new OperationsOnNumbers();
        MatcherAssert.assertThat(num.multiply(fn,ln), is(res));
    }
    @ParameterizedTest
    @CsvSource({"0,100,0","-1,20.5,0","1.2,-5,0","111,-10.0,0","0,1111,0"})
    public void dividingNegative(double fn,double ln, double res) throws InterruptedException {
        OperationsOnNumbers num = new OperationsOnNumbers();
        MatcherAssert.assertThat(num.divide(fn,ln), is(res));
    }
    @ParameterizedTest
    @CsvSource({"-0,100,-1","-1,20,-1","1,-5,-1","111,210,-1","0,0,0"})
    public void substractingNegative(int fn,int ln, int res) throws InterruptedException {
        OperationsOnNumbers num = new OperationsOnNumbers();
        MatcherAssert.assertThat(num.subtract(fn,ln), is(res));
    }
    @ParameterizedTest
    @ValueSource(doubles={100,0,32.3,11.2})
    public void dividingByZeroOther(double fn) throws InterruptedException {
        OperationsOnNumbers num = new OperationsOnNumbers();
        if(fn!=0) {
            Assertions.assertThrows(ArithmeticException.class, () -> {
                double m = num.divide(fn, 0);
            });
        }
        else
        {
            Assertions.assertThrows(NumberFormatException.class, ()->{
                double m= num.divide(fn,0);
            });
        }
    }
}
