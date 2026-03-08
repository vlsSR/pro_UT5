package view;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private JPanel panelInfo, panelInput, panelButton;
    private JLabel info, result;
    private JButton calc, clear;
    private JTextField weight, height;

    public Window() {
        initInfo();
        initInput();
        initButton();
        initScreen();
    }

    public void initInfo() {
        panelInfo = new JPanel();
        panelInfo.setLayout(new FlowLayout(FlowLayout.CENTER));
        info = new JLabel("Bienvenido a la calculadora de IMC");

        panelInfo.add(info);
    }

    public void initInput() {
        panelInput = new JPanel();
        panelInput.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
        weight = new JTextField("Peso", 6);
        height = new JTextField("Altura", 6);

        panelInput.add(weight);
        panelInput.add(height);
    }

    public void initButton() {
        panelButton = new JPanel();
        panelButton.setLayout(new BoxLayout(panelButton, BoxLayout.Y_AXIS));
        calc = new JButton("Calcular");
        clear = new JButton("Limpiar");
        result = new JLabel("Tu IMC es: ");

        calc.setAlignmentX(Component.CENTER_ALIGNMENT);
        clear.setAlignmentX(Component.CENTER_ALIGNMENT);
        result.setAlignmentX(Component.CENTER_ALIGNMENT);

        panelButton.add(calc);
        panelButton.add(clear);
        panelButton.add(result);
    }

    public void initScreen() {
        this.add(panelInfo);
        this.add(panelInput);
        this.add(panelButton);

        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));
        setVisible(true);
        setTitle("Calculadora de IMC");
    }


    public JTextField getHeightT() {
        return height;
    }

    public JTextField getWeightT() {
        return weight;
    }

    public JLabel getResult() {
        return result;
    }

    public JButton getCalc() {
        return calc;
    }

    public JButton getClear() {
        return clear;
    }
}
