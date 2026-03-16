import javax.swing.*;

/*
JFrame es una clase en Java Swing que representa una ventana en una aplicación de escritorio.
Base sobre la que añadimos otros componentes como botones, paneles, menús, etc.
Un JFrame puede tener un título, bordes y controles de ventana (minimizar, maximizar, cerrar).
 */

public class EjemploJFrame {
    public static void main(String[] args) {
        // Creamos el JFram
        JFrame frame = new JFrame("Example JFrame");
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
