package pckg_VJ_1_Z1A;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setCalculationStrategy(new AdditionStrategy());
        Double additionResult = calculator.calculate(1.0, 4.0);
        System.out.println("Addition Result: " + additionResult);

        calculator.setCalculationStrategy(new MultiplicationStrategy());
        Double multiplicationResult = calculator.calculate(6.0, 9.0);
        System.out.println("Multiplication Result: " + multiplicationResult);

        calculator.setCalculationStrategy( new DivisionStrategy());
        Double divisionResult = calculator.calculate(8.0, 0.0);
        System.out.println("Division Result: " + divisionResult);
    }
}
