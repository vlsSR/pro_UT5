package view;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private JPanel panel;
    private JLabel lbCelsius, lbFahrenheit, lbestado;
    private JTextField tfCelsius, tfFahrenheit;
    private JButton btnConversion, btnLimpiar;

    public Window() {
        initComponents();
        initScreen();
    }

    public void initComponents() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2,10,10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        lbCelsius = new JLabel("Temperatura en ªC:");
        tfCelsius = new JTextField();
        lbFahrenheit = new JLabel("Temperatura en ºF:");
        tfFahrenheit = new JTextField();

        btnConversion = new JButton("Convertir");
        lbestado = new JLabel("");

        btnLimpiar = new JButton("Limpiar");


        panel.add(lbCelsius);
        panel.add(tfCelsius);
        panel.add(lbFahrenheit);
        panel.add(tfFahrenheit);
        panel.add(btnConversion);
        panel.add(lbestado);
        panel.add(btnLimpiar);
        add(panel);
    }

    public void initScreen() {
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public JButton getBtnConversion() {
        return btnConversion;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public JTextField getTfCelsius() {
        return tfCelsius;
    }

    public JTextField getTfFahrenheit() {
        return tfFahrenheit;
    }

    public JLabel getLbestado() {
        return lbestado;
    }
}
