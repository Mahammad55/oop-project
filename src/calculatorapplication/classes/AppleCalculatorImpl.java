package calculatorapplication.classes;


import calculatorapplication.interfaces.AppleCalculator;
import calculatorapplication.method.Method;

public class AppleCalculatorImpl extends AbstractCalculator implements AppleCalculator {
    public static void runCalculator() {
        System.out.println("Apple runs.");

        String[] listOfOperations = Method.loadOperations(1);

        System.out.println("Əməliyyatı seçin.");
        for (int i = 0; i < listOfOperations.length; i++) {
            System.out.println(i + 1 + ": " + listOfOperations[i]);
        }

        int operationNumber = Method.numRangePicker(1, listOfOperations.length);

        AppleCalculator calculator = new AppleCalculatorImpl();

        switch (operationNumber) {
            case 1 -> calculator.sum();
            case 2 -> calculator.subtraction();
            case 3 -> calculator.multiply();
            case 4 -> calculator.divide();
            case 5 -> calculator.power();
            case 6 -> calculator.squareRoot();
        }
    }

    @Override
    public void power() {
        System.out.print("İlk ədədi daxil edin: ");
        double num1 = Method.numPicker();
        System.out.print("İkinci ədədi daxil edin: ");
        double num2 = Method.numPicker();
        System.out.printf("The power %s^%s -> %s\n", num1, num2, Math.pow(num1, num2));
        Method.nextOperation();
    }

    @Override
    public void squareRoot() {
        System.out.print("Ədədi daxil edin: ");
        double num = Method.numPicker();
        System.out.printf("The square root of %s -> %s\n", num, Math.sqrt(num));
        Method.nextOperation();
    }
}
