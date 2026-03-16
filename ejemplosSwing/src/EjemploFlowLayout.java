import javax.swing.*;
import java.awt.*;

/*
FlowLayout coloca los componentes en una fila, uno al lado del otro,
y salta a la siguiente fila cuando se llena el espacio.
 */

public class EjemploFlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example FlowLayout");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        frame.add(new JButton("Boton1"));
        frame.add(new JButton("Boton2"));
        frame.add(new JButton("Boton3"));
        frame.add(new JButton("Boton4"));
        frame.add(new JButton("Boton5"));
        frame.add(new JButton("Boton6"));

        frame.setVisible(true);
    }
}
