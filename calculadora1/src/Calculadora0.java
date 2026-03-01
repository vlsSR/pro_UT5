import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora0 extends JFrame implements ActionListener {
    private JTextField numero1;
    private JTextField numero2;
    private JTextField resultado;
    private JRadioButton suma;
    private JRadioButton resta;
    private JRadioButton multiplicacion;
    private JRadioButton divison;
    private JButton botonigual;
    private ButtonGroup operaciones;
    private JPanel botones;

    public Calculadora0() {
        setTitle("Calculadora");
        setSize(800, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setResizable(false);
        numero1 = new JTextField(8);


        botones = new JPanel();
        botones.setLayout(new GridLayout(4, 1));
        suma = new JRadioButton("Suma");
        resta = new JRadioButton("Resta");
        multiplicacion = new JRadioButton("Multiplicacion");
        divison = new JRadioButton("Divison");

        operaciones = new ButtonGroup();
        operaciones.add(suma);
        operaciones.add(resta);
        operaciones.add(multiplicacion);
        operaciones.add(divison);

        botones.add(suma);
        botones.add(resta);
        botones.add(multiplicacion);
        botones.add(divison);
        suma.setSelected(true);
        botones.setVisible(true);

        numero2 = new JTextField(8);
        botonigual = new JButton("=");

        resultado = new JTextField(8);
        resultado.setEditable(false);

        botonigual.addActionListener(this);

        getContentPane().setBackground(Color.PINK);
        botones.setBackground(Color.GREEN);


        add(numero1);
        add(botones);
        add(numero2);
        add(botonigual);
        add(resultado);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(numero1.getText());
            double num2 = Double.parseDouble(numero2.getText());
            double resultadoOperacion = 0;

            if (suma.isSelected()) {
                resultadoOperacion = num1 + num2;
            } else if (resta.isSelected()) {
                resultadoOperacion = num1 - num2;
            } else if (multiplicacion.isSelected()) {
                resultadoOperacion = num1 * num2;
            } else if (divison.isSelected()) {
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(null, "No puedes dividir por 0");
                } else {
                    resultadoOperacion = num1 / num2;
                }
            }
            this.resultado.setText(String.valueOf(resultadoOperacion));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingresa numeros validos");
        }
    }
}
