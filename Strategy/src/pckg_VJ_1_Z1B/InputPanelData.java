package pckg_VJ_1_Z1B;

public class InputPanelData {
    private double firstNumber;
    private double secondNumber;
    private ALG_OPERATION operation;
    public InputPanelData(double firstNumber, double secondNumber, ALG_OPERATION operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }
    public Double getFirstNumber() {
        return firstNumber;
    }
    public Double getSecondNumber() {
        return secondNumber;

    }
    public ALG_OPERATION getOperation() {
        return operation;
    }

}
