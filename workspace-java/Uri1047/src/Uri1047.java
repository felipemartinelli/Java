import java.util.Scanner;

public class Uri1047 {

	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		
		int horaInicial, minutoInicial, horaFinal, minutoFinal, w, x, y, z;
		
		horaInicial     = teclado.nextInt();
		minutoInicial   = teclado.nextInt();
		horaFinal       = teclado.nextInt();
		minutoFinal     = teclado.nextInt();
		
		
		w= 24-horaInicial+horaFinal;
		x= horaFinal-horaInicial;
		y= 60-minutoInicial+minutoFinal;
		z= minutoFinal-minutoInicial;

				if (horaInicial>23 || horaFinal>23 || minutoInicial>60 || minutoFinal>60)
				{
					System.out.println("Um ou mais valores inseridos não corresponde ao formato Horas:Minutos.\nOu seja, de 0 a 23 Horas e de 0 a 60 Minutos"); 
				}
					else
					{
					if (horaInicial==0 && horaFinal==0 || horaFinal==horaInicial && minutoFinal==minutoInicial)
						{
						System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
						}
					else
						{
							if (horaInicial>horaFinal)
								{
									System.out.println("O JOGO DUROU "+ w+ " HORA(S) E "+ y+ "MINUTO(S)");
								}
							else
								{	
									if (horaFinal-horaInicial==1 && minutoInicial>minutoFinal || horaFinal-horaInicial==0 && minutoInicial>minutoFinal)
										{	
										int valor = 60-(minutoInicial-minutoFinal);
											System.out.println("O JOGO DUROU " + 0 + " HORA(S) E " + valor + "MINUTO(S)");
										}
									else
										{
										System.out.println("O JOGO DUROU "+ x+ " HORA(S) E "+ z+ " MINUTO(S)");
										}
								}
						}
					}
		
	}
	
}
