package model;

public class Model {
    public String calcIMC(double weight, double height) {
        double imc = weight / Math.pow(height/100, 2);
        String imcRound = String.format("%.2f", imc);

        if (imc < 18.5) {
            return "Tu IMC es "+imcRound+" - Peso insuficiente";
        } else if (imc >= 18.5 && imc < 25) {
            return "Tu IMC es "+imcRound+" - Peso normal";
        }
        else if (imc >= 25 && imc < 30) {
            return "Tu IMC es "+imcRound+" - Sobrepeso";
        } else {
            return "Tu IMC es "+imcRound+" - Obesidad";
        }
    }
}
