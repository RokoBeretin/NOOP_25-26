package pckg_VJ_1_Z1B;

import javax.swing.*;

public class DivisionStrategy implements CalculationStrategy{
    @Override
    public Double performCalculation(Double firstNumber, Double secondNumber) {

        if (secondNumber == 0) {
            return 0.0;
        } else {
            return firstNumber / secondNumber;
        }
    }
}
