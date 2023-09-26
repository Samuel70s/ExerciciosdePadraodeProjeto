package TesteState;

public class Magico implements State {
private int levelArma =1;
private int getLevelArma() {
	return levelArma++;
}
	
	public State PersonagemEscudo() {
		System.out.println("Adquiriu um Escudo: Nova arma adicionada as hablidades");
		return new Tanque();
	}

	
	public State PersonagemEsapada() {
		System.out.println("Adquiriu uma espada: Nova arma adicionada as hablidades");
		return new Cavaleiro();
	}

	
	public State PersonagemVarinha() {
		System.out.println("Personagem  Adquiriiu outro Escudo. "+"  Varinha LV:  "+ getLevelArma() );
		return this;
	}

	
	public State personagemAtacar() {
		System.out.println("Perosonagem Ataca inimigo com Magia");
		return new AtaquePersonagem();
	}

	
	public State InimigoAtaque() {
		System.out.println("Pesonagem defende e perde 10% da Magia");
		return new AtaqueInimigo();
	}

	
	public String Tipo() {
		
		return "Magico";
	}

}
