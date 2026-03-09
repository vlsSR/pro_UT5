package controller;

import model.Model;
import view.Window;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private Model model;
    private Window view;

    public Controller(Model model, Window view) {
        this.model = model;
        this.view = view;
        view.getBtnConversion().addActionListener(this);
        view.getBtnLimpiar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.getBtnConversion())) {
            try {
                double celsius = Double.parseDouble(view.getTfCelsius().getText());
                double fahrenheit = model.convertir(celsius);
                view.getTfFahrenheit().setText(String.format("%.2f", fahrenheit));
                view.getLbestado().setText("Conversion realizada de forma correcta");
                view.getLbestado().setForeground(Color.GREEN);
            } catch (NumberFormatException ex) {
                view.getLbestado().setText("El numero no tiene el formato correcto");
                view.getLbestado().setForeground(Color.RED);
            }
        } else {
            view.getTfCelsius().setText("");
            view.getTfFahrenheit().setText("");
            view.getLbestado().setText("Limpiado");
            view.getLbestado().setForeground(Color.BLUE);
        }
    }
}
