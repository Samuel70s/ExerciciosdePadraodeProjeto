package TesteMemento;

public class Soma {
		private long numero1;
		private long numero2;
		public void setNumeros(long n1 , long n2) {
			this.numero1 = n1;
			this.numero2 = n2;
		}
		
		public long getNumeros() {
			return numero1 + numero2;
		}
		public Memento getSavenumeros() {
			return new Memento(numero1 , numero2);
		}
		
		public void getReset(Memento memento) {
			numero1 = memento.getSave1();
			numero2 = memento.getSaeve2();
		}

	


}
