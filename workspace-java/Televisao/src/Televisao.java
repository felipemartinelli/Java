
public class Televisao {
	
	private String marca;
	private int voltagem;
	private int tamanho;
	private boolean ligada;
	private int volume;
	private int canal;
	
	
	public Televisao(String marca, int voltagem, int tamanho, boolean ligada, int volume, int canal) {
		this.marca = marca;
		this.voltagem = voltagem;
		this.tamanho = tamanho;
		this.ligada = ligada;
		this.volume = volume;
		this.canal = canal;
	}

	
	public Televisao(String marca, int voltagem, int tamanho) {
		this.marca = marca;
		this.voltagem = voltagem;
		this.tamanho = tamanho;
	}
	
	public Televisao()
	{
		
	}



	public boolean isLigada() {
		return ligada;
	}
	
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	
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
