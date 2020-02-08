import java.util.Scanner;
import java.util.Locale;

public class Ex02Aula1 {
	public static void main(String[]args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	String frase1 = sc.nextLine();
	String frase2 = sc.nextLine();
	int cont1 = frase1.length(), cont2 = frase2.length();
	String soma = (frase1.substring(cont1 - 10)) + (frase2.substring(cont2 - 10));
	System.out.println(soma);
	
	
    sc.close();
	}

}
