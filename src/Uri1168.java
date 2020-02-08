import java.util.Scanner;
import java.util.Locale;
public class Uri1168 {
	public static void main(String[]args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int um = 2, dois = 5, tres = 5, quatro = 4, cinco = 5, seis = 6, sete = 3, oito = 7, nove = 6, zero = 6;
		int qtd = sc.nextInt();
		String numero = "";
		
		
		for(int i=0;i<qtd;i++) {
			int soma = 0;
			numero = sc.next();
			
			for(int j=0;j<numero.length();j++) {
				
				char x = numero.charAt(j);
				if(x == '1') {
					soma = soma + um;
				}
				else if(x == '2') {
					soma = soma + dois;
				}
				else if(x == '3') {
					soma = soma + tres;
				}
				else if(x == '4') {
					soma = soma + quatro;
				}
				else if(x == '5') {
					soma = soma + cinco;
				}
				else if(x == '6') {
					soma = soma + seis;
				}
				else if(x == '7') {
					soma = soma + sete;
				}
				else if(x == '8') {
					soma = soma + oito;
				}
				else if(x == '9') {
					soma = soma + nove;
				}
				else if(x == '0') {
					soma = soma + zero;
				}
			}
			System.out.printf("%d leds%n" ,soma);
			
			
		}
		
		
		
		
		sc.close();
	}

}
