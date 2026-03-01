import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora1 extends JFrame implements ActionListener {

        private final JPanel panelDatos;
        private final JTextField a, b ,c;
        private final JLabel parte1, parte2, parte3, resultado;
        private final JButton resolver;

    public Calculadora1() {
        setSize(1000,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,1));

        panelDatos = new JPanel();
        panelDatos.setLayout(new GridLayout(1, 6));

        a = new JTextField();
        a.setSize(100,50);

        parte1 = new JLabel("x^2");

        b = new JTextField();

        parte2 = new JLabel("x +");

        c = new JTextField();

        parte3 = new JLabel(" = 0");

        resolver = new JButton("RESOLVER");
        resolver.addActionListener(this);

        resultado = new JLabel();

        panelDatos.add(a);
        panelDatos.add(parte1);
        panelDatos.add(b);
        panelDatos.add(parte2);
        panelDatos.add(c);
        panelDatos.add(parte3);
        this.add(panelDatos);
        this.add(resolver);
        this.add(resultado);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double numA = Double.parseDouble(a.getText());
            double numB = Double.parseDouble(b.getText());
            double numC = Double.parseDouble(c.getText());
            double resultado1, resultado2;
            if (numA == 0) {
                JOptionPane.showMessageDialog(this, "No puedes dividir por 0");
            } else if (numB*numB - 4*numA*numC <= 0) {
                JOptionPane.showMessageDialog(this, "No es una ecuacion valida");
            } else {
                resultado1 = (-numB + Math.sqrt(numB*numB - 4*numA*numC)) / (2*numA);
                resultado2 = (-numB - Math.sqrt(numB*numB - 4*numA*numC)) / (2*numA);
                resultado.setText("Las solcuiones son: "+resultado1+" y "+resultado2);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingresa numeros validos");
        }

    }
}
