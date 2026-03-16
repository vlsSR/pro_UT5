import javax.swing.*;
import java.awt.*;

/*
JPanel es un contenedor ligero que se utiliza para organizar otros componentes en un JFrame.
Un JPanel puede contener otros componentes como botones, etiquetas, cuadros de texto, etc.
Se utiliza para gestionar el diseño y organización de la interfaz gráfica.
 */

public class EjemploJPanel {
    public static void main(String[] args) {
        // Creamos la ventana
        JFrame fram = new JFrame("Example JPanel");
        fram.setSize(640,480);
        fram.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Creamos un panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);

        // Añadimos un boton al panel
        JButton boton = new JButton("Pulsa");
        panel.add(boton);

        // Añadimos el panel a la ventana
        fram.add(panel);
        fram.setVisible(true);

    }
}
