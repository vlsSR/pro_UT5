public class LogicaAntigua {
    /*
    import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Carruncha {

	public static void main(String[] args) {
		int saldo_incial = 5;
		partida(saldo_incial);
	}

	public static void partida(int saldo) {
		Scanner tec = new Scanner(System.in);
		int valor1, valor2, valor3;

		imprimir("Bienvenido a la tragaperras de victor!"+
				"\nTu saldo inicial es de: "+saldo+
				"\nCada jugada te cuesta 1 moneda"+
				"\nSacar 2 simbolos iguales ganaras 1 moneda"+
				"\nSacar 3 simbolos iguales es el jackpot ganaras 10 monedas!");

		while (saldo > 0) {

			if(mostrarMenuJugador(tec) == 2) {
				break;
			}
			saldo--;

			valor1 = generarNumeroRandom();
			valor2 = generarNumeroRandom();
			valor3 = generarNumeroRandom();

			imprimir(crearJugada(valor1, valor2, valor3));

			saldo += sumarYMostrarPremio(valor1, valor2, valor3);
			imprimir("\nTras la jugada tu nuevo saldo es: "+saldo);
		}

		if (saldo > 0) {
			imprimir("\nTe has retirado con un saldo de: "+saldo
					+"\nVuelve pronto!");
		} else {
			imprimir("Lo siento te has quedado sin saldo, vuelve a recargar");
		}

	}

	public static int sumarYMostrarPremio(int valor1, int valor2, int valor3) {
		if (valor1 == valor2 && valor2 == valor3) {
			imprimir("\n¡JACKPOT! "
					+ "\nFelicidades has ganado 10 monedas");
			return 10;
		} else if (valor1 == valor2 || valor2 == valor3 || valor1 == valor3) {
			imprimir("\nBien una pareja, has conseguido 1 moneda");
			return 1;
		} else {
			imprimir("\nUna lastima, no hay premio pero sigue intentandolo!");
			return 0;
		}
	}

	public static String crearJugada(int valor1, int valor2, int valor3) {
		String simbolo1, simbolo2, simbolo3;
		simbolo1 = convertirSimbolo(valor1);
		simbolo2 = convertirSimbolo(valor2);
		simbolo3 = convertirSimbolo(valor3);

		return "\n|"+simbolo1+"|"+simbolo2+"|"+simbolo3+"|";
	}

	public static String convertirSimbolo(int valor) {
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

	public static int mostrarMenuJugador(Scanner tec) {
		imprimir("\nIntroduce una opción: "
				+ "\n1 seguir jugando "
				+ "\n2 retirarte");
		return leerNumeroValido(tec);
	}

	public static int leerNumeroValido(Scanner tec) {
		int num = 0;
		do {
			try {
				num = tec.nextInt();
				if (num != 1 && num != 2) {
					imprimir("Introduce solo el numero 1 o el numero 2");
				}
			} catch (InputMismatchException e) {
				imprimir("Introduce solo numeros");
				tec.next();
			}

		} while (num != 1 && num != 2);
		return num;
	}

	public static int generarNumeroRandom() {
		int num;
		Random r1 = new Random();
		num = r1.nextInt(5)+1;
		return num;
	}

	public static void imprimir(String mensaje) {
		System.out.println(mensaje);
	}


}
     */
}
