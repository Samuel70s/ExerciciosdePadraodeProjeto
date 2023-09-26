package TestePrototype;
public class Teste {
public interface Pedido{
	void setAltura(long altura);
	 void setPeso(long peso);
	 void setNome(String nome);
	Pizza getPizza();
}
public class Pizza implements Pedido{
	private Pizza pizza;
	public Pizza() {
		pizza = new Pizza();
	}
	@Override
	public void setAltura(long altura) {
	pizza.setAltura(altura);	
		
	}
	@Override
	public void setPeso(long peso) {
		pizza.setPeso(peso);
		
	}
	@Override
	public void setNome(String nome) {
		pizza.setNome(nome);
		
	}
	@Override
	public Pizza getPizza() {
		
		return pizza;
	}
//------------------------------------------------------------------------------------------------------------------------
}
public class Hospital{
	private long altura;
	private long peso;
	private String nome;
	public Hospital() {}
	public long getAltura() {
		return altura;
	}
	public void  setAltura(long altura) {
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void  setNome(String nome) {
		this.nome = nome;
	}
	public long getPeso() {
		return peso;
	}
	public void  setPeso(long peso) {
		this.peso = peso;
	}
	public Hospital Clonar() {
		Hospital clone = new Hospital();
		clone.setAltura(this.altura);
		clone.setNome(this.nome);
		clone.setPeso(this.peso);
		return clone;
		
	}
	
}
public class Pessoa{
	private int idade;
	private String nome;
	private long altura;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getltura() {
		return altura;
	}
	public void setAltura(long altura) {
		this.altura = altura;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Pessoa(Pessoa objeto) {
		this.altura = objeto.getltura();
		this.idade = objeto.getIdade();
		this.nome = objeto.getNome();
	}
	public Pessoa pessoa() {
		return new Pessoa(this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}































