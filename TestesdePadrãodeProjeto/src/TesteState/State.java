package TesteState;

public interface State {
	public State PersonagemEscudo();
	public State PersonagemEsapada();
	public State PersonagemVarinha();
	public State personagemAtacar();
	public State InimigoAtaque();
	public String Tipo();

}
