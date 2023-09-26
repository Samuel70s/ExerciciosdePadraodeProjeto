package TesteMemento;

public class Memento {
	private long estadosalve1;
	private long estadosalve2;
	
	public Memento(long numero1, long numero2) {
		this.estadosalve1 = numero1;
		this.estadosalve2 = numero2;
	}

	
	public long getSave1() {
		return estadosalve1;
	}
	public long getSaeve2() {
		return estadosalve2;
	}

}
