import java.util.Scanner;

public class AppAplicaProva {
	
	public static void main(String args[]) {
		
		Scanner teclado = new Scanner(System.in);
		String resposta;
		QuestaoSimples questoes[] = new QuestaoSimples[3];
		
		 questoes[0] = new QuestaoSimples("Quanto é 2x2?","4");
		 questoes[1] = new QuestaoMultiplaEscolha("Quanto é 2x2?","4","1","2","4","6");
		 questoes[2] = new QuestaoComDica("Quanto é 2x2?","4","Maior que 3 e menor que 5");
		 
		 for(int i = 0; i<questoes.length;i++) {
			 System.out.println(questoes[i].aplicarQuestao());
			 resposta = teclado.nextLine();
			 questoes[i].corrigir(resposta);
			 
			 if(questoes[i].corrigir(resposta)) {
				 System.out.println("Resposta Correta.");
			 }
			 else {
				 System.out.println("Resposta Errada.");
			 }
			 
		 }
		
		
		
		
	}
	
}
