import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JPanel panelBienvenida, panelResultado, panelInformacion, panelApuesta, panelApostar, panelColorAbajo, panelColorArriba;
    private JTextField apuesta;
    private JLabel bienvenida, figuras, tresIguales, dosIguales, ceroIguales, introduceApuesta, dineroActual;
    private JButton apostar;
    private int dinero;

    public Ventana() {
        initColoresArriba();
        initDatos();
        initResultado();
        initInformacion();
        initApuesta();
        initApostar();
        initColoresAbajo();

        initPantalla();

    }

    public void initPantalla() {
        this.add(panelColorArriba);
        this.add(panelBienvenida);
        this.add(panelResultado);
        this.add(panelInformacion);
        this.add(panelApuesta);
        this.add(panelApostar);
        this.add(panelColorAbajo);
        setSize(900, 800);
        setTitle("DAM CASINO");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 1));
        setVisible(true);

    }

    private void initDatos() {
        panelBienvenida = new JPanel();
        panelBienvenida.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 40));
        bienvenida = new JLabel("DAM CASINO");
        bienvenida.setFont(new Font("Fuente", Font.BOLD, 30));
        panelBienvenida.add(bienvenida);
        panelBienvenida.setBackground(new Color(224, 224, 224));
    }

    private void initResultado() {
        panelResultado = new JPanel();
        panelResultado.setLayout(new FlowLayout(FlowLayout.CENTER,10, 20));
        figuras = new JLabel("| ❤️ |   | 🔔 |   | 💎 |");
        figuras.setFont(new Font("Fuente", Font.PLAIN, 50));
        panelResultado.add(figuras);
        panelResultado.setBackground(new Color(224, 224, 224));
    }

    private void initInformacion() {
        panelInformacion = new JPanel();
        panelInformacion.setLayout(new GridLayout(4,1));
        dinero = 10;
        dineroActual = new JLabel("Dinero actual: " +dinero);
        tresIguales = new JLabel("3 iguales = X10");
        dosIguales = new JLabel("2 iguales = X3");
        ceroIguales = new JLabel("0 iguales = 0");
        dineroActual.setFont(new Font("Fuente", Font.BOLD, 20));
        tresIguales.setFont(new Font("Fuente", Font.BOLD, 20));
        dosIguales.setFont(new Font("Fuente", Font.BOLD, 18));
        ceroIguales.setFont(new Font("Fuente", Font.BOLD, 16));

        dineroActual.setHorizontalAlignment(SwingConstants.CENTER);
        tresIguales.setHorizontalAlignment(SwingConstants.CENTER);
        dosIguales.setHorizontalAlignment(SwingConstants.CENTER);
        ceroIguales.setHorizontalAlignment(SwingConstants.CENTER);


        panelInformacion.add(tresIguales);
        panelInformacion.add(dosIguales);
        panelInformacion.add(ceroIguales);
        panelInformacion.add(dineroActual);
        panelInformacion.setBackground(new Color(224, 224, 224));
    }

    private void initApuesta() {
        panelApuesta = new JPanel();
        panelApuesta.setLayout(new GridLayout(2, 1));
        JPanel panelTexto = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 10));

        introduceApuesta = new JLabel();
        introduceApuesta.setText("Introduce cuanto dinero quieres apostar");
        introduceApuesta.setHorizontalAlignment(SwingConstants.CENTER);
        introduceApuesta.setFont(new Font("Fuente", Font.BOLD, 15));

        apuesta = new JTextField(4);
        apuesta.setPreferredSize(new Dimension(0, 40));

        panelApuesta.add(introduceApuesta);
        panelTexto.add(apuesta);
        panelTexto.setBackground(new Color(224, 224, 224));
        panelApuesta.add(panelTexto);
        panelApuesta.setBackground(new Color(224, 224, 224));

    }

    private void initApostar() {
        panelApostar = new JPanel();
        panelApostar.setLayout(new FlowLayout(FlowLayout.CENTER,0 ,10));

        apostar = new JButton("APOSTAR");
        apostar.setPreferredSize(new Dimension(150, 80));

        panelApostar.add(apostar);
        panelApostar.setBackground(new Color(224, 224, 224));
    }

    private void initColoresAbajo() {
        panelColorAbajo = new JPanel();
        panelColorAbajo.setLayout(new GridLayout(1, 5));
        for (int i = 2; i < 9; i++) {
            JPanel panel = new JPanel();

            if (i % 2 == 0) {
                panel.setBackground(Color.RED);
            } else {
                panel.setBackground(Color.BLACK);
            }

            panelColorAbajo.add(panel);
        }
    }

    private void initColoresArriba() {
        panelColorArriba = new JPanel();
        panelColorArriba.setLayout(new GridLayout(1, 5));
        for (int i = 1; i < 8; i++) {
            JPanel panel = new JPanel();

            if (i % 2 == 0) {
                panel.setBackground(Color.RED);
            } else {
                panel.setBackground(Color.BLACK);
            }

            panelColorArriba.add(panel);
        }

    }

    public JTextField getApuesta() {
        return apuesta;
    }

    public JButton getApostar() {
        return apostar;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public JLabel getFiguras() {
        return figuras;
    }

    public JLabel getDineroActual() {
        return dineroActual;
    }
}