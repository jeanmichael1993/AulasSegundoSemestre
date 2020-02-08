import java.util.Scanner;
import java.util.Locale;

public class Ex04Aula1 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String frase = sc.nextLine();
		int numero = sc.nextInt();
		String novaFrase = "", novoNumero = "", numero2 = "";

		if (numero == 9) {

			numero2 = String.valueOf(numero);
			novoNumero = "0";
		} else {
			novoNumero = String.valueOf(numero + 1);
			numero2 = String.valueOf(numero);
		}

		novaFrase = frase.replace(numero2, novoNumero);

		System.out.println(novaFrase);

		sc.close();
	}

}
