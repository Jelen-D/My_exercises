package Head_first;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProstyGUI {
    JFrame frame; //te 2 składowe musza być dostępne dla klas wewnętrznych
    JLabel label;

    JButton buttonColor;  // składowe możliwe do utworzenia w metodzie
    JButton buttonLabel;
    PanelGraficzny panel = new PanelGraficzny();

    public static void main(String[] args) {
        ProstyGUI apiGUI = new ProstyGUI();
        apiGUI.start();
    }

    public void start(){

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Etykieta do zmiany");

        buttonColor = new JButton("Zmień kolor");
        buttonColor.addActionListener(new ColorListener());

        buttonLabel = new JButton("Zmień etykietę");
        buttonLabel.addActionListener(new LabelListener());

        frame.getContentPane().add(BorderLayout.SOUTH, buttonColor);
        frame.getContentPane().add(BorderLayout.EAST, buttonLabel);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.CENTER, panel);

        frame.setSize(500,300);
        frame.setVisible(true);
    }

    class ColorListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ec) {
            frame.repaint();
        }
    }

    class LabelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent el) {
            label.setText("Kliknięto przycisk");
        }
    }
}
