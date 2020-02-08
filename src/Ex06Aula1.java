import java.util.Scanner;
import java.util.Locale;

public class Ex06Aula1 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String palavra1 = sc.next();
		String palavra2 = sc.next();

		int comparar = palavra1.compareTo(palavra2);

		if (comparar == 0) {

			System.out.println("Iguais");

		}

		else if (comparar < 0) {

			System.out.println(palavra1 + " " + palavra2);
		}

		else {

			System.out.println(palavra2 + " " + palavra1);

		}

		sc.close();
	}

}
