package calculatorapplication.program;

import calculatorapplication.config.Config;
import calculatorapplication.method.Method;


public class Program {
    public static void main(String[] args) {
        System.out.println("""
                Aşağıdakı 4 kalkulyatordan birini seçin.
                1. Apple Calculator
                2. Huawei Calculator
                3. Samsung Calculator
                4. Xiaomi Calculator""");

        Config.currentCalculatorNum = Method.numRangePicker(1, 4);

        Method.runCalculator();
    }
}
