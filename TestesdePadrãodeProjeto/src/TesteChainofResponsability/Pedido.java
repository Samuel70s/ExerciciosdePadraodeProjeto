package TesteChainofResponsability;

public class Pedido {

	public static void main(String[] args) {
		Concrete1 concrete1 = new Concrete1();
		Concrete2 concrete2 = new Concrete2();
		Concrete3 concrete3 =new Concrete3();
		
		concrete1.setPedido(concrete3);
		concrete2.setPedido(concrete1);
		concrete3.setPedido(concrete2);
		
		concrete1.refctorPedido(70);
		concrete2.refctorPedido(30);
		concrete3.refctorPedido(200);

	}

}
