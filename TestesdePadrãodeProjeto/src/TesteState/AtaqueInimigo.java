package TesteState;

public class AtaqueInimigo implements State {

	
	public State PersonagemEscudo() {
		
		return this;
	}

	
	public State PersonagemEsapada() {
		
		return this;
	}

	
	public State PersonagemVarinha() {
		
		return this;
	}

	
	public State personagemAtacar() {
		
		return this;
	}

	
	public State InimigoAtaque() {
	System.out.println("Inimigo ataca Personagem");
		return this;
	}

	
	public String Tipo() {
		
		return "Inimigo";
	}

}
