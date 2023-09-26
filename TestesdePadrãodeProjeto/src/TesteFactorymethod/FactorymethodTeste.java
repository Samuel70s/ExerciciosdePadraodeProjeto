package TesteFactorymethod;


public class FactorymethodTeste {
public static void main(String []args) {
	poligon Tigle = FactoryMethod.Poligono.startpoligono(3);
	poligon Square = FactoryMethod.Poligono.startpoligono(4);
	poligon Pentagon = FactoryMethod.Poligono.startpoligono(5);
	System.out.println(Tigle.getValue());
	System.out.println(Square.getValue());
	System.out.println(Pentagon.getValue());
	  
}
}
