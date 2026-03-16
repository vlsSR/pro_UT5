import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

public class EjemploComboBox {
    public static void main(String[] args) {
        List<String> listapaises = List.of("Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Ecuador", "Paraguay", "Peru", "Uruguay", "Venezuela");
        JFrame frame = new JFrame("Example JComboBox");
        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //
        frame.setLayout(new GridLayout(2,2));
        JLabel lapais = new JLabel("Pais");
        JComboBox<String> paises = new JComboBox<String>();
        listapaises.forEach(pais -> paises.addItem(pais));
        JLabel laresu = new JLabel();
        paises.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource()==paises) {
                    String seleccionado = (String) paises.getSelectedItem();
                    laresu.setText(seleccionado);
                }
            }
        });

        frame.add(lapais);
        frame.add(paises);
        frame.add(laresu);
        //frame.pack();
        frame.setVisible(true);

    }
}
