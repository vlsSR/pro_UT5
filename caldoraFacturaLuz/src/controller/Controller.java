package controller;

import model.Model;
import view.Window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{

    private Model model;
    private Window view;

    public Controller(Model model, Window view) {
        this.model = model;
        this.view = view;
        view.getCalc().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double potencia = Double.parseDouble(view.getPotencia().getText());
            double consumo = Double.parseDouble(view.getConsumo().getText());
            double precio = Double.parseDouble(view.getPrecio().getText());
            double cost = model.calcFinalCost(model.calcBaseCost(potencia,consumo,precio));
            String tag = model.getTag(consumo);
            String costText = String.format("%.2f", cost);
            String message = "Total a pagar: "+costText+" ("+tag+")";
            view.getResult().setText(message);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Los valores introducidos no son validos");
        }
    }
}
