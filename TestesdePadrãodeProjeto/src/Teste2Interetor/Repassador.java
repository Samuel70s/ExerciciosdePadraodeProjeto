package Teste2Interetor;

public class Repassador extends Pessoa {
	
private String repassarNome;
private double ReppassarSalario;
private String Repassarcargo;




public void setRepassadordeCargo(String cargo) {
	this.Repassarcargo = cargo;
	
}


public String getRepassadordeCargo() {
	
	return Repassarcargo;
}



public double getRemuneração() {
	
	return ReppassarSalario;
}



public void setRepassarSalario(double salario) {
	this.ReppassarSalario = salario;
	
}



public void setNome(String nome) {
	this.repassarNome = nome ;
	
}



public String getNome() {

	return repassarNome;
}







}
