package Teste2Interetor;

public class Funcionario extends Pessoa{
	private String nome;
	private double salario;
	private String Cargo;
	
	
	public double getRemuneração() {
		
		return salario;
	}

	
	public void setRepassarSalario(double salario) {
		
		this.salario  =salario;
	}

	
	public void setRepassadordeCargo(String cargo) {
		this.Cargo = cargo;
		
	}


	public String getRepassadordeCargo() {
		
		return Cargo;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
		
	}

	
	public String getNome() {
		
		return nome;
	}

	

}
