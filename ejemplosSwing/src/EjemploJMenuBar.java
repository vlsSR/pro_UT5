import javax.swing.*;

/*
JMenuBar es un componente que se utiliza para crear una barra de menú en un JFrame.
Una barra de menú puede contener varios JMenu y cada JMenu puede contener varios JMenuItem.
Los menús son desplegables y permiten al usuario ejecutar diferentes acciones en la aplicación.
 */

public class EjemploJMenuBar {
    public static void main(String[] args) {
        // Creamos la ventana
        JFrame fra = new JFrame("Example JMenuBar");
        fra.setSize(800, 600);
        fra.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Creamos la barra de Menu
        JMenuBar menuBar = new JMenuBar();

        // Creamos el menu
        JMenu menuFile = new JMenu("File");

        // Creamos las opciones (items) del menu
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        // Añadimo las opciones al menu
        menuFile.add(open);
        menuFile.add(save);
        // Añadimos un separador
        menuFile.addSeparator();
        menuFile.add(exit);

        // Añadimos el menu a la barra de menu
        menuBar.add(menuFile);

        // Añadimos la barra de menu a la ventana
        fra.setJMenuBar(menuBar);

        fra.setVisible(true);
    }
}
