import java.util.Scanner;

public class Uri1164 {
	
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		int numvezes, somaDivi = 0, contador =0;
		
		numvezes     = teclado.nextInt();
		int num[] = new int[numvezes];
	
		for(int i=0;i<num.length;i++) {
			num[i] = teclado.nextInt();				
		}
		
		for(int i=0;i<num.length;i++) {
			
			while(somaDivi < num[i])
			{
			contador++;
				if(num[i] % contador == 0) {
					somaDivi += contador;
				}
			}
			
			if(somaDivi == num[i]) {
				System.out.println( num[i] + " eh perfeito");
			}
			else {
				System.out.println( num[i] + " nao eh perfeito");
			}
			
			contador = 0;
			somaDivi = 0;
			
			
		}
		
		

		
		teclado.close();
	}

}
