package TesteState;

public class Jogador {

	public static void main(String[] args) {
		State jogador = new Personagem();
jogador = jogador.PersonagemEscudo();
jogador = jogador.PersonagemEscudo();
jogador = jogador.PersonagemEscudo();
jogador = jogador.PersonagemEsapada();
jogador = jogador.PersonagemVarinha();
jogador = jogador.InimigoAtaque();	
}

}
