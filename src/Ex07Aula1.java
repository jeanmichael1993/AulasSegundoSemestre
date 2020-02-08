import java.util.Scanner;
import java.util.Locale;

public class Ex07Aula1 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char caractere = ' ';
		String [] texto = sc.nextLine().split(" ");
		
		for(int i=0;i<texto.length;i++) {
			
			for(int j=0;j<texto[i].length();j++) {
				
				int numero = texto[i].charAt(j);
				caractere = (char) (numero + 3);
				System.out.printf("%s", caractere);
				
			}
			
			if(i<texto.length - 1) {
			System.out.print(" ");
			}
		}
		
		

		sc.close();
	}

}
