import java.util.Scanner;
import java.util.Locale;

public class Ex03Aula1 {
	public static void main(String[]args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	String palavra = sc.next();
	sc.nextLine();
	String frase = sc.nextLine();
	int cont = frase.length(), resultado=0;
	System.out.println(cont);
	
	if(frase.contains(palavra)) {
		if(frase.substring(0,cont/2).contains(palavra)){
			resultado = 1;
		}
		else {
			resultado = 2;
		}
		
		
	}
	else {
		resultado=0;
	}
	
	System.out.println(resultado);
    sc.close();
	}

}
