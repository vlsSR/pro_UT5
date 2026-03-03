package view;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JPanel panelDatos;
    private JPanel panelResolver;
    private JPanel panelResultado;
    private JTextField a, b, c;
    private JLabel parte1, parte2, parte3, resultado;
    private JButton resolver;

    public Ventana() {
        initDatos();
        initResolver();
        initResultado();
        initPantalla();
    }

    private void initDatos() {
        panelDatos = new JPanel();
        panelDatos.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 40));

        a = new JTextField(8);

        parte1 = new JLabel("x^2");

        b = new JTextField(8);

        parte2 = new JLabel("x +");

        c = new JTextField(8);

        parte3 = new JLabel(" = 0");
    }

    public void initPantalla() {
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

        setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));
        setVisible(true);
    }

    private void initResolver() {
        panelResolver = new JPanel();
        panelResolver.setLayout(new FlowLayout(FlowLayout.CENTER));
        resolver = new JButton("RESOLVER");
        resolver.setPreferredSize(new Dimension(150, 50));
    }

    private void initResultado() {
        panelResultado = new JPanel();
        panelResultado.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        resultado = new JLabel();
    }

    public JTextField getA() {
        return a;
    }

    public JTextField getB() {
        return b;
    }

    public JTextField getC() {
        return c;
    }

    public void setResultado(String texto) {
        resultado.setText(texto);
    }

    public JButton getResolver() {
        return resolver;
    }
}
