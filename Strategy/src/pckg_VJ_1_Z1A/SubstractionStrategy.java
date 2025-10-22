package pckg_VJ_1_Z1A;

public class SubstractionStrategy implements CalculationStrategy {
    @Override
    public Double performCalculation(Double firstNumber, Double secondNumber) {
        return firstNumber - secondNumber;
    }
}
