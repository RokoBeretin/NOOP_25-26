package pckg_VJ_1_Z1A;

public class Calculator {
    private CalculationStrategy calculationStrategy;

    public void setCalculationStrategy(CalculationStrategy calculationStrategy) {
        this.calculationStrategy = calculationStrategy;
    }

    public Double calculate(Double firstNumber, Double secondNumber) {
        return calculationStrategy.performCalculation(firstNumber, secondNumber);
    }

}
