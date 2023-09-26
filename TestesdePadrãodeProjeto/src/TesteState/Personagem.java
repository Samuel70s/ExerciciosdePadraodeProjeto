package TesteState;

public class Personagem implements State {

	
	public State PersonagemEscudo() {
		System.out.println("Adquiriu um escudo: Personagem Tanque");
		return new Tanque();
	}

	
	public State PersonagemEsapada() {
		System.out.println("Adquiriu uma espada: personagem Cavaleiro");
		return new Cavaleiro();
	}

	
	public State PersonagemVarinha() {
	System.out.println("Personagem adquiriu uma varinha: Personagem Magico");
		return new Magico();
	}

	
	public State personagemAtacar() {
		System.out.println("Personagem Utilizou o ataque base");
		return new AtaquePersonagem();
	}

	
	public State InimigoAtaque() {
		System.out.println("Ataque inimigo");
		return new AtaqueInimigo();
	}

	
	public String Tipo() {
		
		return "Personagem Base";
	}

}
