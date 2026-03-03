package controller;

import model.Calcular;
import view.Ventana;

public class Main {
    public static void main(String[] args) {
        Calcular model = new Calcular();
        Ventana view = new Ventana();
        CalculadoraController calculadoraController = new CalculadoraController(model, view);
    }
}
