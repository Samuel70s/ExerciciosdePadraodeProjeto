package TesteIterator;

public class implementInterator implements Iterator{
Amazon[]intens;
private int posicao = 0;
	public implementInterator(Amazon[]intens) {
		this.intens = intens;
	}
	public boolean HashNext() {
		if(posicao>=intens.length||intens[posicao]==null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		Amazon jogo = intens[posicao];
		posicao++;
		return jogo;
	}

}
