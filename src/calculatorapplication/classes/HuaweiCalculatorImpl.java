package calculatorapplication.classes;

import calculatorapplication.interfaces.HuaweiCalculator;
import calculatorapplication.method.Method;

public class HuaweiCalculatorImpl extends AbstractCalculator implements HuaweiCalculator {

    @Override
    public void sin() {
        System.out.print("Ədədi daxil edin: ");
        double num = Method.numPicker();
        System.out.printf("The sin of %s is: %s\n", num, Math.sin(num));
    }

    @Override
    public void cos() {
        System.out.print("Ədədi daxil edin: ");
        double num = Method.numPicker();
        System.out.printf("The cos of %s is: %s\n", num, Math.cos(num));
    }
}
