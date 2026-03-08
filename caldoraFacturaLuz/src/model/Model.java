package model;

public class Model {
    public double calcBaseCost(double potencia, double consumo, double precio) {
        return potencia*0.12*30+consumo*precio;
    }

    public double calcFinalCost(double baseCost) {
        return baseCost*1.07;
    }

    public String getTag(double consumo) {
        if (consumo < 150) return "Etiqueta A - Hogar muy eficiente";
        if (consumo > 250) return "Etiqueta F - Alto consumo ¡Revisa tus electromésticos!";
        return "Etiqueta C - Consumo normal";
    }
}
