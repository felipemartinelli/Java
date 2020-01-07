import java.util.Scanner;

public class Uri1044 {
	
	public static void main(String args[])
	{
		int a, b;
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		a = teclado.nextInt();
		b = teclado.nextInt();
		
		if(b%a == 0 || a%b == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		teclado.close();
		
	}

}
