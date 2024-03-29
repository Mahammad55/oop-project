package calculatorapplication.method;

import calculatorapplication.classes.AppleCalculatorImpl;
import calculatorapplication.classes.HuaweiCalculatorImpl;
import calculatorapplication.classes.SamsungCalculatorImpl;
import calculatorapplication.classes.XiaomiCalculatorImpl;
import calculatorapplication.config.Config;
import calculatorapplication.program.Program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Method {
    public static double numPicker() {
        double chooseNumber = Double.MAX_VALUE;
        boolean hasNumChosenCorrectly = false;

        while (!hasNumChosenCorrectly) {
            try {
                chooseNumber = new Scanner(System.in).nextDouble();
            } catch (InputMismatchException e) {
                System.err.println("Xəta: Həqiqi ədəd daxil etmək lazımdır: Yenidən ədəd daxil edin.");
            }

            if (chooseNumber != Double.MAX_VALUE) {
                hasNumChosenCorrectly = true;
            }
        }
        return chooseNumber;
    }

    public static int numRangePicker(int leftRange, int rightRange) {
        int chooseNumber = Integer.MAX_VALUE;
        boolean hasChosenCorrectly = false;

        while (!hasChosenCorrectly) {
            try {
                chooseNumber = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.err.printf("Xəta: Yalnız %s-%s aralığında tam ədəd daxil etmə olar.\n", leftRange, rightRange);
            }

            if (chooseNumber >= leftRange && chooseNumber <= rightRange) {
                hasChosenCorrectly = true;
            }

            if (!hasChosenCorrectly) {
                System.out.printf("Zəhmət olmasa %s-%s aralığında tam ədəd daxil edin.\n", leftRange, rightRange);
            }
        }
        return chooseNumber;
    }

    public static String[] loadOperations(int calculatorNum) {
        switch (calculatorNum) {
            case 1 -> {
                return new String[]{"Add", "Subtract", "Multiply", "Divide", "Power", "Square Root"};
            }
            case 2 -> {
                return new String[]{"Add", "Subtract", "Multiply", "Divide", "Sin", "Cos"};
            }
            case 3 -> {
                return new String[]{"Add", "Subtract", "Multiply", "Divide", "Log", "LogE", "Log10"};
            }
            default -> {
                return new String[]{"Add", "Subtract", "Multiply", "Divide", "Round", "Round Floor", "Round Ceil"};
            }
        }
    }

    public static void runCalculator() {
        switch (Config.currentCalculatorNum) {
            case 1 -> AppleCalculatorImpl.runCalculator();
            case 2 -> HuaweiCalculatorImpl.runCalculator();
            case 3 -> SamsungCalculatorImpl.runCalculator();
            case 4 -> XiaomiCalculatorImpl.runCalculator();
        }
    }

    public static void nextOperation() {
        System.out.println("Əməliyyatı dəyişmək üçün 1,Kalkulyatoru dəyişmək üçün 2,Proqramı sonlandırmaq üçün 0 daxil edin.");

        int chosenOperation = numRangePicker(0, 2);

        switch (chosenOperation) {
            case 0 -> System.exit(0);
            case 1 -> Method.runCalculator();
            default -> Program.main(null);
        }
    }
}
