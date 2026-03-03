import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora2 extends JFrame implements ActionListener {

        private final JPanel panelDatos, panelResolver, panelResultado;
        private final JTextField a, b ,c;
        private final JLabel parte1, parte2, parte3, resultado;
        private final JButton resolver;

    public Calculadora2() {
        setSize(600,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,1));

        panelDatos = new JPanel();
        panelDatos.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 40));


        a = new JTextField(8);

        parte1 = new JLabel("x^2");

        b = new JTextField(8);

        parte2 = new JLabel("x +");

        c = new JTextField(8);

        parte3 = new JLabel(" = 0");

        panelResolver = new JPanel();
        panelResolver.setLayout(new FlowLayout(FlowLayout.CENTER));
        resolver = new JButton("RESOLVER");
        resolver.addActionListener(this);
        resolver.setPreferredSize(new Dimension(150,50));

        panelResultado = new JPanel();
        panelResultado.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        resultado = new JLabel();

        panelDatos.add(a);
        panelDatos.add(parte1);
        panelDatos.add(b);
        panelDatos.add(parte2);
        panelDatos.add(c);
        panelDatos.add(parte3);
        panelResolver.add(resolver);
        panelResultado.add(resultado);
        this.add(panelDatos);
        this.add(panelResolver);
        this.add(panelResultado);

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
