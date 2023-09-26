package TesteChainofResponsability;

public class Concrete2 extends ClassicHandler{
	public void refctorPedido(int raf) {
		if(raf>50 && raf<100) {
			System.out.println("New solicitation 2 cod  " + raf);
		}
		
		else{
			
			super.refctorPedido(raf);
		}

	}

}
