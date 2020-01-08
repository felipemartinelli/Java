
public class AppBiblioteca {
	
	public static void main(String args[]) {
		
		Livro l1 = new Livro("Livro 1","Autor 1","2000","Terror",5,18);
		
		Livro l2 = new Livro("Livro 2","Autor 2","1990","Romance",3,4);
		
		Livro l3 = new Livro("Livro 3","Autor 3","1980","Aventura",8,10);
		
		Livro l4 = new Livro("Livro 4","Autor 4","2010","Acao",10,19);
		
		Livro l5 = new Livro("Livro 5","Autor 5","2020","Auto Ajuda",1,5);
		
		System.out.println("--- Livro 1 ---");
		l1.isEmprestado();
		l1.solicitarEmprestimo();
		l1.isEmprestado();
		l1.devolverEmprestimo();
		l1.isEmprestado();
		System.out.println("\n\n");
		
		System.out.println("--- Livro 2 ---");
		l2.isEmprestado();
		l2.solicitarEmprestimo();
		l2.isEmprestado();
		l2.devolverEmprestimo();
		l2.isEmprestado();
		System.out.println("\n\n");
		
		System.out.println("--- Livro 3 ---");
		l3.isEmprestado();
		l3.solicitarEmprestimo();
		l3.isEmprestado();
		l3.devolverEmprestimo();
		l3.isEmprestado();
		System.out.println("\n\n");
		
		System.out.println("--- Livro 4 ---");
		l4.isEmprestado();
		l4.solicitarEmprestimo();
		l4.isEmprestado();
		l4.devolverEmprestimo();
		l4.isEmprestado();
		System.out.println("\n\n");
		
		System.out.println("--- Livro 5 ---");
		l5.isEmprestado();
		l5.solicitarEmprestimo();
		l5.isEmprestado();
		l5.devolverEmprestimo();
		l5.isEmprestado();
		System.out.println("\n\n");
				
		
	}

}
