package calculatorapplication.classes;

import calculatorapplication.interfaces.SamsungCalculator;
import calculatorapplication.method.Method;

public class SamsungCalculatorImpl extends AbstractCalculator implements SamsungCalculator {
    public static void runCalculator() {
        System.out.println("Samsung runs.");

        String[] listOfOperations = Method.loadOperations(3);

        System.out.println("Əməliyyatı seçin.");
        for (int i = 0; i < listOfOperations.length; i++) {
            System.out.println(i + 1 + ": " + listOfOperations[i]);
        }

        int operationNumber = Method.numRangePicker(1, listOfOperations.length);

        SamsungCalculator calculator = new SamsungCalculatorImpl();

        switch (operationNumber) {
            case 1 -> calculator.sum();
            case 2 -> calculator.subtraction();
            case 3 -> calculator.multiply();
            case 4 -> calculator.divide();
            case 5 -> calculator.log();
            case 6 -> calculator.logE();
            case 7 -> calculator.log10();
        }
    }

    @Override
    public void log() {
        System.out.print("İlk ədədi daxil edin: ");
        double num1 = Method.numPicker();
        System.out.print("İkinci ədədi daxil edin: ");
        double num2 = Method.numPicker();
        System.out.printf("The logarithm of %s from %s is: %s\n", num1, num2, Math.log(num2) / Math.log(num1));
        Method.nextOperation();
    }

    @Override
    public void logE() {
        System.out.print("Ədədi daxil edin: ");
        double num = Method.numPicker();
        System.out.printf("The logarithm of E from %s is: %s\n", num, Math.log(num));
        Method.nextOperation();
    }

    @Override
    public void log10() {
        System.out.print("Ədədi daxil edin: ");
        double num = Method.numPicker();
        System.out.printf("The logarithm of 10 from %s is: %s\n", num, Math.log10(num));
        Method.nextOperation();
    }
}
