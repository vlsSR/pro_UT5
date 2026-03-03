package model;

public class Calcular {
    public String calcularResultado(String textoA, String textoB, String textoC) {
        try {
            double numA = Double.parseDouble(textoA);
            double numB = Double.parseDouble(textoB);
            double numC = Double.parseDouble(textoC);

            double resultado1, resultado2;
            if (numA == 0) {
                return "No puedes dividir por 0";
            } else if (numB*numB - 4*numA*numC <= 0) {
                return "No es una ecuacion valida";
            } else {
                resultado1 = (-numB + Math.sqrt(numB*numB - 4*numA*numC)) / (2*numA);
                resultado2 = (-numB - Math.sqrt(numB*numB - 4*numA*numC)) / (2*numA);
                return "Las solcuiones son: "+resultado1+" y "+resultado2;
            }

        } catch (NumberFormatException ex) {
            return "Ingresa numeros validos";
        }
    }
}
