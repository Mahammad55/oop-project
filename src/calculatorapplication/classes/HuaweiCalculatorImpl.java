package calculatorapplication.classes;

import calculatorapplication.interfaces.HuaweiCalculator;
import calculatorapplication.method.Method;

public class HuaweiCalculatorImpl extends AbstractCalculator implements HuaweiCalculator {

    public static void runCalculator() {
        System.out.println("Huawei runs.");

        String[] listOfOperations = Method.loadOperations(2);

        System.out.println("Əməliyyatı seçin.");
        for (int i = 0; i < listOfOperations.length; i++) {
            System.out.println(i + 1 + ": " + listOfOperations[i]);
        }

        int operationNumber = Method.numRangePicker(1, listOfOperations.length);

        HuaweiCalculator calculator = new HuaweiCalculatorImpl();

        switch (operationNumber) {
            case 1 -> calculator.sum();
            case 2 -> calculator.subtraction();
            case 3 -> calculator.multiply();
            case 4 -> calculator.divide();
            case 5 -> calculator.sin();
            case 6 -> calculator.cos();
        }
    }

    @Override
    public void sin() {
        System.out.print("Ədədi daxil edin: ");
        double num = Method.numPicker();
        System.out.printf("The sin of %s is: %s\n", num, Math.sin(num));
        Method.nextOperation();
    }

    @Override
    public void cos() {
        System.out.print("Ədədi daxil edin: ");
        double num = Method.numPicker();
        System.out.printf("The cos of %s is: %s\n", num, Math.cos(num));
        Method.nextOperation();
    }
}
