package view;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private JPanel panelNorth, panelCenter, panelSouth;
    private JLabel northText, potenciaText, consumoText, precioText, result;
    private JTextField potencia, consumo, precio;
    private JButton calc;

    public Window() {
        initNorth();
        initCenter();
        initSouth();
        initScreen();
    }

    public void initSouth() {
        panelSouth = new JPanel(new FlowLayout(FlowLayout.CENTER));
        calc = new JButton("Calcular Factura");
        result = new JLabel("Resultado: ");

        panelSouth.add(calc);
        panelSouth.add(result);
    }

    public void initCenter() {
        panelCenter = new JPanel(new GridLayout(3, 2, 10, 10));
        potenciaText = new JLabel("Potencia contratada (kW): ");
        potenciaText.setHorizontalAlignment(SwingConstants.RIGHT);

        potencia = new JTextField();

        consumoText = new JLabel("Consumo mensual (kWh): ");
        consumoText.setHorizontalAlignment(SwingConstants.RIGHT);

        consumo = new JTextField();

        precioText = new JLabel("Precio del kWh (€): ");
        precioText.setHorizontalAlignment(SwingConstants.RIGHT);

        precio = new JTextField();


        panelCenter.add(potenciaText);
        panelCenter.add(potencia);
        panelCenter.add(consumoText);
        panelCenter.add(consumo);
        panelCenter.add(precioText);
        panelCenter.add(precio);
    }

    public void initNorth() {
        panelNorth = new JPanel(new FlowLayout(FlowLayout.CENTER));
        northText = new JLabel("Consumo Eléctrico Calculadora");

        panelNorth.add(northText);
    }

    public void initScreen() {
        setLayout(new BorderLayout());
        setVisible(true);
        setTitle("La Maleta Eléctrica");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        add(panelNorth, BorderLayout.NORTH);
        add(panelCenter, BorderLayout.CENTER);
        add(panelSouth, BorderLayout.SOUTH);

    }

    public JTextField getPotencia() {
        return potencia;
    }

    public JTextField getConsumo() {
        return consumo;
    }

    public JTextField getPrecio() {
        return precio;
    }

    public JButton getCalc() {
        return calc;
    }

    public JLabel getResult() {
        return result;
    }
}


