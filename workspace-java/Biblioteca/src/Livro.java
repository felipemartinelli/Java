

public class Livro {
	
	private String titulo;
	private String autor;
	private String anoPublicacao;
	private String categoria;
	private int numeroEstante;
	private int numeroPrateleira;
	private boolean emprestado;
	
	public Livro(String titulo, String autor, String anoPublicacao, String categoria, int numeroEstante,
			int numeroPrateleira) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.categoria = categoria;
		this.numeroEstante = numeroEstante;
		this.numeroPrateleira = numeroPrateleira;
		this.emprestado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getNumeroEstante() {
		return numeroEstante;
	}

	public void setNumeroEstante(int numeroEstante) {
		this.numeroEstante = numeroEstante;
	}

	public int getNumeroPrateleira() {
		return numeroPrateleira;
	}

	public void setNumeroPrateleira(int numeroPrateleira) {
		this.numeroPrateleira = numeroPrateleira;
	}


	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	
	public void solicitarEmprestimo() {
		if(this.emprestado == true) {
			System.out.println("Este livro ja esta emprestado");
		}
		else {
			this.emprestado = true;
			System.out.println("Emprestimo realizado com Sucesso");
		}
	}
	
	public void devolverEmprestimo() {
		if(this.emprestado == false) {
			System.out.println("Este livro ja foi devolvido");
		}
		else {		
		this.emprestado = false;
		System.out.println("Devolvido com Sucesso");
		}
	}
	
	public void isEmprestado() {
		if(this.emprestado == true) {
			System.out.println("O status do livro é: Emprestado");
		}
		else {
			System.out.println("O status do livro é: Disponivel");
		}
	}
	
}




