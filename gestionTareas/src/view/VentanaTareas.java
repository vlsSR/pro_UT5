package view;

import model.Tarea;

import javax.swing.*;
import java.awt.*;

public class VentanaTareas extends JFrame {


    public JTextField txTarea = new JTextField(20);
    public JButton btnAgregar = new JButton("Añadir");
    public DefaultListModel<Tarea> modeloLlista = new DefaultListModel<>();
    public JList<Tarea> listaTareas = new JList<>(modeloLlista);
    public JButton btnCompletada = new JButton("Marcar completada");

    public JButton btnEliminar = new JButton("Eliminar");
    public JButton btnSalir = new JButton("Salir");

    public VentanaTareas() {
        setTitle("Mis tareas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelUP = new JPanel();
        panelUP.add(new JLabel("Tarea:"));
        panelUP.add(txTarea);
        panelUP.add(btnAgregar);

        add(panelUP, BorderLayout.NORTH);
        add(new JScrollPane(listaTareas), BorderLayout.CENTER);
        JPanel panelDOWN = new JPanel();
        panelDOWN.add(btnCompletada);
        panelDOWN.add(btnEliminar);
        panelDOWN.add(btnSalir);
        add(panelDOWN, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null);
    }

}
