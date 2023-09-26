package TesteIterator;

public class Amazon {
	private String NomeJogo;
	private int quantidade;
	private double preco;
public void setNome(String nome) {
	this.NomeJogo = nome;
}

public void setQuantidade(int quant) {
	this.quantidade = quant;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public String getNomeJogo() {
	return NomeJogo;
}

public int getQuantidade() {
	return quantidade;
}

public double getPreco() {
	return preco*quantidade;
}

}
