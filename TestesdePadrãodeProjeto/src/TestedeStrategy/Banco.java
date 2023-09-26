package TestedeStrategy;

public class Banco {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(1000);
		CompradeJuros compra = new CompradeJuros(new Bradesco());
		System.out.println(compra.Compra(pedido));

	}

}
