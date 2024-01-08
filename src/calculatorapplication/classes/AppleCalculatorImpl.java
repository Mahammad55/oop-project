package calculatorapplication.classes;


import calculatorapplication.interfaces.AppleCalculator;
import calculatorapplication.method.Method;

public class AppleCalculatorImpl extends AbstractCalculator implements AppleCalculator {
    @Override
    public void power() {
        System.out.print("İlk ədədi daxil edin: ");
        double num1 = Method.numPicker();
        System.out.print("İkinci ədədi daxil edin: ");
        double num2 = Method.numPicker();
        System.out.printf("The power %s^%s -> %s\n", num1, num2, Math.pow(num1, num2));
    }

    @Override
    public void squareRoot() {
        System.out.print("Ədədi daxil edin: ");
        double num = Method.numPicker();
        System.out.printf("The square root of %s -> %s\n", num, Math.sqrt(num));
    }
}
