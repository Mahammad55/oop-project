package calculatorapplication.classes;


import calculatorapplication.interfaces.XiaomiCalculator;
import calculatorapplication.method.Method;

public class XiaomiCalculatorImpl extends AbstractCalculator implements XiaomiCalculator {
    @Override
    public void round() {
        System.out.print("Ədədi daxil edin: ");
        double num = Method.numPicker();
        System.out.printf("The round of %s is: %s\n", num, Math.round(num));
    }

    @Override
    public void roundFloor() {
        System.out.print("Ədədi daxil edin: ");
        double num = Method.numPicker();
        System.out.printf("The round floor of %s is: %s\n", num, Math.floor(num));
    }

    @Override
    public void roundCeil() {
        System.out.print("Ədədi daxil edin: ");
        double num = Method.numPicker();
        System.out.printf("The round ceil of %s is: %s\n", num, Math.ceil(num));
    }
}
