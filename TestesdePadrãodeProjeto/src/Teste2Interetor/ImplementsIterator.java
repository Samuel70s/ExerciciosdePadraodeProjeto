package Teste2Interetor;

public class ImplementsIterator implements Iterator{
public Repassador[]cargo;
 int posicao = 0;

public ImplementsIterator( Repassador [] cargo) {
	this.cargo = cargo;
}

public boolean HashNext() {
	if(posicao>= cargo.length|| cargo[posicao]==null) {
	return false;
	}
	return true;
}

@Override
public Object next() {
	Repassador carg = cargo[posicao];
	posicao++;
	return carg;
}


}
