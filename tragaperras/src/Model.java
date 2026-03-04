import javax.swing.*;
import java.util.Random;

public class Model {
    public String crearJugada(int valor1, int valor2, int valor3) {
        String simbolo1, simbolo2, simbolo3;
        simbolo1 = convertirSimbolo(valor1);
        simbolo2 = convertirSimbolo(valor2);
        simbolo3 = convertirSimbolo(valor3);

        return "| "+simbolo1+" |   | "+simbolo2+" |   | "+simbolo3+" |";
    }

    public int calcularPremio(int apuesta, int valor1, int valor2, int valor3) {
        if (valor1 == valor2 && valor2 == valor3) {
            return apuesta*10;
        } else if (valor1 == valor2 || valor2 == valor3 || valor1 == valor3) {
            return apuesta*3;
        } else {
            return 0;
        }
    }

    public String convertirSimbolo(int valor) {
        switch (valor) {
            case 1:
                return "❤️";
            case 2:
                return "💎";
            case 3:
                return "🧲";
            case 4:
                return "🔔";
            case 5:
                return "🍋";
            default:
                return "error";
        }
    }

    public int generarNumeroRandom() {
        int num;
        Random r1 = new Random();
        num = r1.nextInt(5)+1;
        return num;
    }
}
