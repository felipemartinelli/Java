
public class Televisao {
	
	String marca;
	int voltagem;
	int tamanho;
	boolean ligada;
	int volume;
	int canal;
	
	
	public void switchPower() {
		ligada = !ligada;
		System.out.println("A Tv "+ marca +" esta " + ((ligada)?"ligada":"desligada" ));
		// (testeLogico) ? <ValorSeForVerdadeiro> : <ValorSeForFalso>
	}
	
	public void aumentarVolume() {
		if (ligada == false)
		{
			System.out.println("A TV precisa estar ligada");
		}
		else
		{
			volume++;
			if(volume > 10) {
				System.out.println("A TV "+marca+" esta no volume maximo");
			}
			else {
				System.out.println("A TV "+marca+" esta no volume "+volume);
			}			
		}
	}
	
	public void diminuirVolume() {
		if (ligada == false)
		{
			System.out.println("A TV precisa estar ligada");
		}
		else
		{
			volume--;
			if(volume < 1) {
				System.out.println("A TV "+marca+" esta no mudo");
			}
			else {		
				System.out.println("A TV "+marca+" esta no volume "+volume);
			}
		}
	}
	
	public void avancarCanal() {
		if (ligada == false)
		{
			System.out.println("A TV precisa estar ligada");
		}
		else
		{
			canal++;
			if(canal > 10) {
				canal = 1;
			}
			else {
				
				System.out.println("A TV "+marca+" esta no canal "+canal);
			}
		}
	}
	
	public void voltarCanal() {
		if (ligada == false)
		{
			System.out.println("A TV precisa estar ligada");
		}
		else
		{
			canal--;
			if(canal < 1) {
				canal = 10;
			}
			else {
				System.out.println("A TV "+marca+" esta no canal "+canal);
			}
		}
	}	

}
