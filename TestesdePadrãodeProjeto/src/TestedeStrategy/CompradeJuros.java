package TestedeStrategy;

public class CompradeJuros {
private Juros pedido;

public CompradeJuros(Juros pedido) {
	this.pedido = pedido;
}

public double Compra(Pedido  compra) {
	return this.pedido.JurosProduto(compra);
}

}
