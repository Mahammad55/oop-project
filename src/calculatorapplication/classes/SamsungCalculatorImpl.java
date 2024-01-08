package calculatorapplication.classes;

import calculatorapplication.interfaces.SamsungCalculator;
import calculatorapplication.method.Method;

public class SamsungCalculatorImpl extends AbstractCalculator implements SamsungCalculator {
    @Override
    public void log() {
        System.out.print("İlk ədədi daxil edin: ");
        double num1 = Method.numPicker();
        System.out.print("İkinci ədədi daxil edin: ");
        double num2 = Method.numPicker();
        System.out.printf("The logarithm of %s from %s is: %s\n", num1, num2, Math.log(num2) / Math.log(num1));
    }

    @Override
    public void logE() {
        System.out.print("Ədədi daxil edin: ");
        double num = Method.numPicker();
        System.out.printf("The logarithm of E from %s is: %s\n", num, Math.log(num));
    }

    @Override
    public void log10() {
        System.out.print("Ədədi daxil edin: ");
        double num = Method.numPicker();
        System.out.printf("The logarithm of 10 from %s is: %s\n", num, Math.log10(num));
    }
}
