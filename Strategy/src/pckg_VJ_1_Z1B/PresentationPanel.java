package pckg_VJ_1_Z1B;

import javax.swing.*;
import java.awt.*;

public class PresentationPanel extends JPanel {
    private JTextField resultField;
    private JTextArea allResultsArea;
    private JScrollPane scrollPane;

    public PresentationPanel() {
        setPreferredSize(new Dimension(100,100));
        initComps();
        layoutComps();
    }

    private void initComps() {
        this.resultField = new JTextField(15);
        resultField.setEditable(false);
        this.allResultsArea = new JTextArea(10, 15);
        this.scrollPane = new JScrollPane(allResultsArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Result:"), gbc);

        gbc.gridy = 1;
        add(resultField, gbc);

        gbc.gridy = 2;
        add(new JLabel("All Results:"), gbc);

        gbc.gridy = 3;
        add(new JScrollPane(scrollPane), gbc);
    }

    public void setResult(String result) {
        resultField.setText(result);
    }
    public void addResultToAll(String result) {
        allResultsArea.append(result + "\n");
    }

}
