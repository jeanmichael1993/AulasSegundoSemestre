import java.util.Scanner;
import java.util.Locale;

public class Ex01Aula01 {
	public static void main(String[]args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	String frase = sc.nextLine();
	int numero = sc.nextInt(), cont=0;
	String [] palavra = new String[numero];
	
	for(int i=0;i<numero;i++) {
		
		palavra[i] = sc.next();
		
		if(frase.contains(palavra[i])) {
			
			cont = cont + 1;
			
		}
	}
	
	System.out.println(cont);
		
	
    sc.close();
	}

}
