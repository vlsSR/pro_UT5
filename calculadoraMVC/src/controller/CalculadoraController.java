package controller;

import model.Calcular;
import view.Ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraController implements ActionListener{

    private Calcular model;
    private Ventana view;

    public CalculadoraController(Calcular model, Ventana view) {
        this.model = model;
        this.view = view;
        this.view.getResolver().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String resultado = model.calcularResultado(view.getA().getText(), view.getB().getText(), view.getC().getText());
        view.setResultado(resultado);
    }
}
