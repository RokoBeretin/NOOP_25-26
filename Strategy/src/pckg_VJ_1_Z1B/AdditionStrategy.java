package pckg_VJ_1_Z1B;

public class AdditionStrategy implements CalculationStrategy {

    @Override
    public Double performCalculation(Double firstNumber, Double secondNumber) {
        return firstNumber + secondNumber;
    }
}
