package calculatorapplication.classes;


import calculatorapplication.interfaces.XiaomiCalculator;
import calculatorapplication.method.Method;

public class XiaomiCalculatorImpl extends AbstractCalculator implements XiaomiCalculator {
    public static void runCalculator() {
        System.out.println("Xiaomi runs.");

        String[] listOfOperations = Method.loadOperations(4);

        System.out.println("Əməliyyatı seçin.");
        for (int i = 0; i < listOfOperations.length; i++) {
            System.out.println(i + 1 + ": " + listOfOperations[i]);
        }

        int operationNumber = Method.numRangePicker(1, listOfOperations.length);

        XiaomiCalculator calculator=new XiaomiCalculatorImpl();

        switch (operationNumber) {
            case 1 -> calculator.sum();
            case 2 -> calculator.subtraction();
            case 3 -> calculator.multiply();
            case 4 -> calculator.divide();
            case 5 -> calculator.round();
            case 6 -> calculator.roundFloor();
            case 7 -> calculator.roundCeil();
        }
    }

    @Override
    public void round() {
        System.out.print("Ədədi daxil edin: ");
        double num = Method.numPicker();
        System.out.printf("The round of %s is: %s\n", num, Math.round(num));
        Method.nextOperation();
    }

    @Override
    public void roundFloor() {
        System.out.print("Ədədi daxil edin: ");
        double num = Method.numPicker();
        System.out.printf("The round floor of %s is: %s\n", num, Math.floor(num));
        Method.nextOperation();
    }

    @Override
    public void roundCeil() {
        System.out.print("Ədədi daxil edin: ");
        double num = Method.numPicker();
        System.out.printf("The round ceil of %s is: %s\n", num, Math.ceil(num));
        Method.nextOperation();
    }
}
