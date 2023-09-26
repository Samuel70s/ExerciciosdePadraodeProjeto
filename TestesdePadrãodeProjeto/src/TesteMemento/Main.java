package TesteMemento;

public class Main {

	public static void main(String[] args) {
	  Soma soma  = new Soma();
	  Zelador zelador  = new Zelador();
	  soma.setNumeros(4, 2);
      zelador.setMemento(soma.getSavenumeros());
      soma.setNumeros(2809, 634763279);
      System.out.println(soma.getNumeros());      
	soma.getReset(zelador.getMemento());
	System.out.println(soma.getNumeros());
	}

}
