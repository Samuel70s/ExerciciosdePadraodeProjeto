package TesteState;

public class AtaquePersonagem implements State {

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
		
		return this;
	}

	
	public String Tipo() {
	
		return "Ataque Sem ablidade";
	}

}
