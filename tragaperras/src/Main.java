
public class Main {

    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        Model model = new Model();
        new Controller(ventana, model);
    }
}
