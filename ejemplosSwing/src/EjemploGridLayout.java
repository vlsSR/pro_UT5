import javax.swing.*;
import java.awt.*;

public class EjemploGridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example GridLayout");
        frame.setSize(600, 480);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Creamos un GridLayout de 2 filas y 3 columnas
        frame.setLayout(new GridLayout(3,3));

        frame.add(new JButton("Boton1"));
        frame.add(new JButton("Boton2"));
        frame.add(new JButton("Boton3"));
        frame.add(new JButton("Boton4"));
        frame.add(new JButton("Boton5"));
        frame.add(new JButton("Boton6"));
        frame.add(new JButton("Boton7"));
        frame.add(new JButton("Boton8"));

        frame.setVisible(true);
    }
}
