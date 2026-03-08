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
        view.getClear().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(view.getCalc())) {
            try {
                double weight = Double.parseDouble(view.getWeightT().getText());
                double height = Double.parseDouble(view.getHeightT().getText());
                String result = model.calcIMC(weight, height);
                view.getResult().setText(result);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(view, "No has introducido numeros validos");
            }
        }
        else {
            view.getHeightT().setText("");
            view.getWeightT().setText("");
            view.getResult().setText("Tu IMC es: ");
        }
    }
}
