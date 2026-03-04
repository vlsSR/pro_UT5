import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private Ventana ventana;
    private Model model;

    public Controller(Ventana ventana, Model model){
        this.ventana = ventana;
        this.model = model;
        ventana.getApostar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int apuesta, dinero;
        try {
            apuesta = Integer.parseInt(ventana.getApuesta().getText());
            dinero = ventana.getDinero();
            if (apuesta > dinero) {
                JOptionPane.showMessageDialog(ventana, "No puedes apostar mas del dinero que tienes");
            }
            else  if (apuesta < 0) {
                JOptionPane.showMessageDialog(ventana, "No puedes apostar negativo");
            } else if (apuesta == 0) {
                JOptionPane.showMessageDialog(ventana, "No te queda dinero, perdiste");
            } else {
                dinero -= apuesta;
                int valor1 = model.generarNumeroRandom();
                int valor2 = model.generarNumeroRandom();
                int valor3 = model.generarNumeroRandom();

                String judada = model.crearJugada(valor1, valor2, valor3);

                int premio = model.calcularPremio(apuesta, valor1, valor2, valor3);



                dinero += premio;

                ventana.getFiguras().setText(judada);

                ventana.setDinero(dinero);

                ventana.getDineroActual().setText("Dinero actual: " +dinero);

                JOptionPane.showMessageDialog(ventana, "Ganaste "+premio);
            }

        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(ventana, "No has introducido un numero valido");
        }
    }
}
