import java.util.Scanner;

public class Uri1101 {

	public static void main(String args[]) {

		Scanner teclado;
		int m, n, maior = 0, menor = 0, soma = 0;
		
		teclado = new Scanner(System.in);
		
		m = teclado.nextInt();
		n = teclado.nextInt();
		
		while (m > 0 && n > 0) {
		
		if(m > n) {
			maior = m;
			menor = n;
		}
		else if(n > m){
			maior = n;
			menor = m;
		}

		
		for(int i=menor;i<=maior;i++) {
			System.out.print(i + " ");
			soma += i;
		}
		
		System.out.println("Sum="+soma);
		
		m = teclado.nextInt();
		if(m <= 0) {
			break;
		}
		else {
			n = teclado.nextInt();
		}
		
		
		soma = 0;

		}	
		teclado.close();
	}

}
