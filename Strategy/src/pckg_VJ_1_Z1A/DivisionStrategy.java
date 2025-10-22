package pckg_VJ_1_Z1A;

public class DivisionStrategy implements CalculationStrategy{
    @Override
    public Double performCalculation(Double firstNumber, Double secondNumber) {
        try {
            return firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        return null;
    }

}
