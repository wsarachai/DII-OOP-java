package org.dii.oop.lesson06.exercise02;

import org.dii.oop.lesson06.exercise01.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeApp extends JFrame implements ActionListener {
    private static final String[] menu ={
            "Circle",
            "Rectangle",
            "Right triangle",
            "Square",
            "Resize shape",
            "Display all shape"
    };

    private final JComboBox comboBox;
    private JPanel panel;
    private GridBagLayout layout;

    private JLabel label01;
    private JTextField textField01;
    private JLabel label02;
    private JTextField textField02;
    private JList listView;
    private DefaultListModel listModel;
    private JButton button01;

    private void addChild(Component child, int gridx, int gridy, int gridwidth) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.gridx = gridx;
        gridBagConstraints.gridy = gridy;
        gridBagConstraints.gridwidth = gridwidth;
        panel.add(child, gridBagConstraints);

    }

    public ShapeApp() {
        super("Shape Application");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 300));
        layout = new GridBagLayout();

        comboBox = new JComboBox<String>(menu);
        label01 = new JLabel("Radius: ");
        textField01 = new JFormattedTextField("");
        label02 = new JLabel("Label: ");
        textField02 = new JFormattedTextField("");
        button01 = new JButton("OK");

        listModel = new DefaultListModel<Shape>();
        listView = new JList<Shape>(listModel);

        panel.setLayout(layout);

        comboBox.addActionListener(this);
        button01.addActionListener(this);

        addChild(comboBox, 0, 0, 2);
        addChild(label01, 0, 1, 1);
        addChild(textField01, 1, 1, 1);
        addChild(label02, 0, 2, 1);
        addChild(textField02, 1, 2, 1);
        addChild(button01, 0, 3, 2);
        addChild(listView, 0, 4, 2);

        label02.setVisible(false);
        textField02.setVisible(false);

        // Set the window to be visible as the default to be false
        add(panel);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            String choice = (String) comboBox.getSelectedItem();

            if ("Circle".trim().equals(choice)) {
                String strRadius = textField01.getText();
                double radius = Double.parseDouble(strRadius);
                // TODO: uncomment this line
                // listModel.addElement(new Circle(radius));
            }
            else if ("Rectangle".trim().equals(choice)) {
                String strWidth = textField01.getText();
                String strHigh = textField02.getText();
                double width = Double.parseDouble(strWidth);
                double high = Double.parseDouble(strHigh);
                // TODO: uncomment this line
                // listModel.addElement(new Rectangle(width, high));
            }
            // TODO: write the other shape classes behavior here

        } else if (e.getSource() instanceof JComboBox) {
            String choice = (String) comboBox.getSelectedItem();
            if ("Circle".equals(choice)) {
                label01.setText("Radius:");
                textField01.setText("");
                label02.setVisible(false);
                textField02.setVisible(false);
            } else if ("Rectangle".equals(choice)) {
                label01.setText("Width:");
                label02.setText("High:");
                textField01.setText("");
                textField02.setText("");
                label02.setVisible(true);
                textField02.setVisible(true);
            }
            // TODO: write the other shape classes behavior here.
        }
    }
}
