package Teste2Interetor;

public class Pessoa  {
	private String nome;
	private String Cargo;
	private double salario;
	
	
	public void setNome(String nome) {
		this.nome = nome;

	}

	
	public String getNome() {
		
		return nome;
	}

	
	public void setRepassadordeCargo(String cargo) {
		this.Cargo = cargo;

	}

	
	public String getRepassadordeCargo() {

		return Cargo;
	}

	public double getRemuneração() {
		
		return salario;
	}

	public void setRepassarSalario(double salario) {
		this.salario = salario;

	}

}
