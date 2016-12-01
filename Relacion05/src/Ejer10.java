/**
 * 10. Escribir un programa que, devuelva el número de palabras que hay en una
 * cadena introducida por teclado. Ten en cuenta que entre dos palabras puede
 * haber más de un blanco. También al principio y al final de la frase puede
 * haber blancos redundantes. Por ejemplo, si la cadena es “He estudiado mucho”,
 * debe devolver 3.
 * 
 * @author alumnodiurno
 *
 */
public class Ejer10 {
	public static void main(String[] args) {
		System.out.println(cuentaPalabras("Tu mama me toca"));
	}

	private static int cuentaPalabras(String cad) {
		int palabras = 0;
		boolean dentroPalabra = false;
		char caracter;

		for (int i = 0; i < cad.length(); i++) {

			caracter = cad.charAt(i);

			if (!Character.isWhitespace(caracter)) {

				if (!dentroPalabra) {

					dentroPalabra = true;
					palabras++;

				}

			} else {
				dentroPalabra = false;
			}
		}

		return palabras;
	}
}
