package calculatorapplication.method;

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
}
