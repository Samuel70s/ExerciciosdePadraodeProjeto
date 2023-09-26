package TesteIterator;

public class Cliente {
public static void main(String args[]) {
	
	Amazon[] jogos = new Amazon[5];
	jogos[0] = new Amazon();
	jogos[1] = new Amazon();
	jogos[2] = new Amazon();
	jogos[3] = new Amazon();
	jogos[4] = new Amazon();
	
	jogos[0].setNome("GTA V");
	jogos[0].setQuantidade(2);
	jogos[0].setPreco(120);
	
	jogos[1].setNome("Rokcte League");
	jogos[1].setQuantidade(1);
	jogos[1].setPreco(50);
	
	jogos[2].setNome("Fortnite - Salve o Mundo"); 
	jogos[2].setQuantidade(1);
	jogos[2].setPreco(70);
	
	jogos[3].setNome("Watch-Dogs");
	jogos[3].setQuantidade(2);
	jogos[3].setPreco(90);
	
	jogos[4].setNome("Conan");
	jogos[4].setQuantidade(1);
	jogos[4].setPreco(130);
	
	
	Iterator lop = new implementInterator(jogos);
	
	while(lop.HashNext()) {
		Amazon jogo = (Amazon) lop.next();
		System.out.println(jogo.getNomeJogo() + " : R$ "+jogo.getPreco() +
				" ; Quantidade "+ jogo.getQuantidade());
	}
}
}
