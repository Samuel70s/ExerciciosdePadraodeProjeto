package TesteChainofResponsability;

public class ClassicHandler implements Implementação {
private Implementação implementacao;
	@Override
	public void setPedido(Implementação implementação) {
		implementacao = implementação;

	}

	@Override
	public void refctorPedido(int raf) {
		if(implementacao!=null) {
			implementacao.refctorPedido(raf);
		}

	}

}
