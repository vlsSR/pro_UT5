package controller;

import model.GestionTareas;
import model.Tarea;
import view.VentanaTareas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private GestionTareas modelo;
    private VentanaTareas vista;

    public Controller(GestionTareas modelo, VentanaTareas vista) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.btnAgregar.addActionListener(e -> agregarTarea());
        this.vista.btnCompletada.addActionListener(e -> accionCompletar());
        this.vista.btnEliminar.addActionListener(e -> accionEliminar());
        this.vista.btnSalir.addActionListener(e -> accionSalir());
    }

    private void agregarTarea() {
        String descrip = vista.txTarea.getText();
        if (!descrip.isEmpty()) {
            modelo.addTarea(descrip);
            actualizarListaEnVista();
            vista.txTarea.setText("");
        }
    }

    private void accionCompletar() {
        int indice = vista.listaTareas.getSelectedIndex();
        if (indice != -1) {
            modelo.marcarCompletada(indice);
            actualizarListaEnVista();
        }
    }

    private void actualizarListaEnVista() {
        vista.modeloLlista.clear();
        for (Tarea tarea : modelo.getTareas()) {
            vista.modeloLlista.addElement(tarea);
        }
    }

    private void accionEliminar() {
        int indice = vista.listaTareas.getSelectedIndex();
        modelo.eliminarTarea(indice);
        actualizarListaEnVista();
    }

    public void accionSalir() {
        System.exit(0);
    }
}
