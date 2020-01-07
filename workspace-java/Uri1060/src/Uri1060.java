import java.util.Scanner;

public class Uri1060 {
	
	public static void main(String args[]) {
		
		double num;
		int cont = 0;
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		for(int i =0;i<6;i++) {
			num = teclado.nextDouble();
			
			if(num > 0) {
				cont++;
			}
			
		}
		
		System.out.println(cont+" valores positivos");
		
		
		teclado.close();
	}

}
