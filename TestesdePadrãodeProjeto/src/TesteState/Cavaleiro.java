package TesteState;

public class Cavaleiro implements State {
private int levelArma = 1 ;
	public int getLevelArma() {
		return levelArma++;
	}
	public State PersonagemEscudo() {
		System.out.println("Adquiriu uma espada: Nova arma adicionada as hablidades");
		return new Tanque();
	}

	public State PersonagemEsapada() {
		System.out.println("Personagem  Adquiriiu outro Escudo. "+"  Espada LV:  "+getLevelArma());
		return this;
	}

	
	public State PersonagemVarinha() {
		System.out.println("Personagem adquiriu uma varinha: Nova arma Adicionada as habilidades");
		return new Magico();
	}

	
	public State personagemAtacar() {
		System.out.println("Perosonagem Ataca inimigo com Espada");
		return new AtaquePersonagem();
	}

	
	public State InimigoAtaque() {
		System.out.println("Pesonagem defende e perde 10% da Espada ");
		return new AtaqueInimigo();
	}

	
	public String Tipo() {
	
		return "Cavaleiro";
	}

}
