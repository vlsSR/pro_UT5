package controller;

import model.Model;
import view.Window;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        Window view = new Window();
        Controller controller = new Controller(model, view);
    }
}
