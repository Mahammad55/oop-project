package calculatorapplication.classes;

import calculatorapplication.method.Method;

public abstract class AbstractCalculator {
    public void sum() {
        System.out.print("İlk ədədi daxil edin: ");
        double num1 = Method.numPicker();
        System.out.print("İkinci ədədi daxil edin: ");
        double num2 = Method.numPicker();
        System.out.printf("%s + %s = %s\n", num1, num2, num1 + num2);
        Method.nextOperation();
    }

    public void subtraction() {
        System.out.print("İlk ədədi daxil edin: ");
        double num1 = Method.numPicker();
        System.out.print("İkinci ədədi daxil edin: ");
        double num2 = Method.numPicker();
        System.out.printf("%s - %s = %s\n", num1, num2, num1 - num2);
        Method.nextOperation();
    }

    public void multiply() {
        System.out.print("İlk ədədi daxil edin: ");
        double num1 = Method.numPicker();
        System.out.print("İkinci ədədi daxil edin: ");
        double num2 = Method.numPicker();
        System.out.printf("%s * %s = %s\n", num1, num2, num1 * num2);
        Method.nextOperation();
    }

    public void divide() {
        System.out.print("İlk ədədi daxil edin: ");
        double num1 = Method.numPicker();
        System.out.print("İkinci ədədi daxil edin: ");
        double num2 = Method.numPicker();
        System.out.printf("%s / %s = %s\n", num1, num2, num1 / num2);
        Method.nextOperation();
    }
}
