package pckg_VJ_1_Z1B;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputPanel extends JPanel {
    private JTextField fstNumberField;
    private JTextField sndNumberField;
    private JComboBox<ALG_OPERATION> operationComboBox;
    private JButton calculateButton;
    private InputPanelListener inputPanelListener;

    public InputPanel() {
        Border outer = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border inner = BorderFactory.createTitledBorder("Input calculator");
        Border border = BorderFactory.createCompoundBorder(outer, inner);
        setBorder(border);
        Dimension dims = getPreferredSize();
        dims.width = 220;
        setPreferredSize(dims);
        initComps();
        layoutComps();
        activatePanel();

    }

    public void setInputPanelListener(InputPanelListener inputPanelListener) {
        this.inputPanelListener = inputPanelListener;
    }

    private void initComps() {
        this.fstNumberField = new JTextField("", 5);
        this.sndNumberField = new JTextField("", 5);
        this.operationComboBox = new JComboBox<>();
        DefaultComboBoxModel<ALG_OPERATION> model = new DefaultComboBoxModel<>();
        for(ALG_OPERATION op : ALG_OPERATION.values()) {
            model.addElement(op);
        }
        operationComboBox.setModel(model);
        operationComboBox.setSelectedIndex(-1);
        calculateButton = new JButton("Calculate");
    }

    private void layoutComps() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("FST Number"), gbc);

        gbc.gridx = 1;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(fstNumberField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;

        add(new JLabel("SND Number"), gbc);

        gbc.gridx = 1;
        add(sndNumberField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets(5, 5, 5, 5);
        add(new JLabel("Operation"), gbc);

        gbc.gridx = 1;
        add(operationComboBox, gbc);

        gbc.gridy = 4;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(20, 5, 5, 5);
        add(calculateButton, gbc);



    }

    private void activatePanel() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    Double fst = Double.parseDouble(fstNumberField.getText());
                    Double snd = Double.parseDouble(sndNumberField.getText());
                    ALG_OPERATION algOperation = (ALG_OPERATION) operationComboBox.getSelectedItem();
                    InputPanelData inputPanelData = new InputPanelData(fst, snd, algOperation);
                    if(inputPanelListener != null) {
                        inputPanelListener.inputPanelEventOccurred(inputPanelData);
                    }
                }catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(InputPanel.this, ex.getMessage(), "Exeption input", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }


}
