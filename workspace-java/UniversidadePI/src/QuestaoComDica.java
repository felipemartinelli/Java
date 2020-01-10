
public class QuestaoComDica extends QuestaoSimples{
	
	protected String dica;
	
	public QuestaoComDica(String enunciado, String resposta, String dica) {
		super(enunciado,resposta);
		this.dica = dica;
	}

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}
	
	public String aplicarQuestao() {
		String res = super.aplicarQuestao() + "\n"+dica;
		return res;
	}
	

}
