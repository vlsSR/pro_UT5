package controller;

import model.GestionTareas;
import view.VentanaTareas;

public class Main {
    public static void main(String[] args) {
        GestionTareas gestionTareas = new GestionTareas();
        VentanaTareas view = new VentanaTareas();
        new Controller(gestionTareas, view);
        view.setVisible(true);
    }
}
