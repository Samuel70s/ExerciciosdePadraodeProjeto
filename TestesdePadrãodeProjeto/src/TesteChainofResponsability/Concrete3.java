package TesteChainofResponsability;

public class Concrete3 extends ClassicHandler {
	public void refctorPedido(int raf) {
		if(raf>100) {
			System.out.println("New solicitation 3 cod  " + raf);
		}
		
		else{
			
			super.refctorPedido(raf);
		}

	}
}
