import javax.swing.*;
import java.awt.*;

/*
BorderLayout organiza los componentes en cinco áreas: norte, sur, este, oeste y centro.
 */

public class EjemploBorderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example BorderLayout");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Definimos que el Layout va a ser BorderLayout
        frame.setLayout(new BorderLayout());

        // Añadimos un boton en cada area
        frame.add(new Button("Norte"), BorderLayout.NORTH);
        frame.add(new Button("Sur"), BorderLayout.SOUTH);
        frame.add(new Button("Este"), BorderLayout.EAST);
        frame.add(new Button("Oeste"), BorderLayout.WEST);
        frame.add(new Button("Center"), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
