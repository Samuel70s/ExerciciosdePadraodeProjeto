package TesteState;

public class Tanque implements State {
	private int levelArma = 1; 

	private int getLevelArma() { 
		return levelArma++;
	}
	public State PersonagemEscudo() {
		System.out.println("Personagem  Adquiriiu outro Escudo. "+"  Escudo LV:  "+ getLevelArma());
		return this;
	}

	
	public State PersonagemEsapada() {
		System.out.println("Adquiriu uma espada: Nova arma adicionada as hablidades");
		return new Cavaleiro();
	}

	
	public State PersonagemVarinha() {
		System.out.println("Personagem adquiriu uma varinha: Nova arma Adicionada as habilidades");
		return new Magico();
	}

	
	public State personagemAtacar() {
	    System.out.println("Perosonagem Ataca inimigo com escudo");
		return new AtaquePersonagem();
	}

	
	public State InimigoAtaque() {
		System.out.println("Pesonagem defende e perde 10% do escudo ");
		return new AtaqueInimigo();
	}

	
	public String Tipo() {
	
		return "Tanque";
	}

}
