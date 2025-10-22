package pckg_VJ_1_Z1B;

import javax.swing.*;
import java.awt.*;



public class MainFrame extends JFrame {
    private InputPanel inputPanel;
    private PresentationPanel presentationPanel;

    public MainFrame(){
        super("Simple Calc");
        setSize(500,350);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
        layoutComps();
        activateMainFrame();
    }

    private void initComponents() {
        this.inputPanel = new InputPanel();
        this.presentationPanel = new PresentationPanel();
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(presentationPanel, BorderLayout.CENTER);
        add(inputPanel, BorderLayout.WEST);





    }

    private void activateMainFrame() {
        inputPanel.setInputPanelListener(new InputPanelListener() {

            @Override
            public void inputPanelEventOccurred(InputPanelData ev) {
                CalculationStrategy calculationStrategy = resolveAlgOperation(ev.getOperation());
                Double result = calculationStrategy.performCalculation(ev.getFirstNumber(), ev.getSecondNumber());
                if(result == 0.0 && ev.getOperation() == ALG_OPERATION.DIVISION){
                    JOptionPane.showMessageDialog(MainFrame.this, "Error: Division by zero!", "Calculation Error", JOptionPane.ERROR_MESSAGE);
                    presentationPanel.setResult("Error: Division by zero!");
                } else {
                    presentationPanel.setResult(Double.toString(result));
                    presentationPanel.addResultToAll(ev.getFirstNumber() + " " + ev.getOperation().toString() + " " + ev.getSecondNumber() + " = " + result);
                }

            }

        });
    }

    private CalculationStrategy resolveAlgOperation(ALG_OPERATION algOperation){
        switch (algOperation.toString()){
            case "Addition": return new AdditionStrategy();
            case "Subtraction": return new SubstractionStrategy();
            case  "Multiplication": return new MultiplicationStrategy();
            case  "Division": return new DivisionStrategy();
            default: return null;
        }
    }

}
