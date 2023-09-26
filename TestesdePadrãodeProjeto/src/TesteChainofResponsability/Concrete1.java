package TesteChainofResponsability;

public class Concrete1 extends ClassicHandler{
	public void refctorPedido(int raf) {
		if(raf<=50) {
			System.out.println("New solicitation 1 cod  " + raf);
		}
		
		else{
			
			super.refctorPedido(raf);
		}

	}

}
