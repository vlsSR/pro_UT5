package model;

import java.util.ArrayList;

public class GestionTareas {
    private ArrayList<Tarea> tareas;

    public GestionTareas() {
        this.tareas = new ArrayList<>();
    }

    public void addTarea(String descripcion) {
        tareas.add(new Tarea(descripcion));
    }

    public void marcarCompletada(int indice) {
        tareas.get(indice).setCompletado(true);
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    public void eliminarTarea(int indice) {
        tareas.remove(indice);
    }
}
