package TesteCommander;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Autenticação  {
	
	private int estado= 0;
	private Conta conta;
	private ArrayList<String> BancoId = new ArrayList<String>();
	
	private ArrayList <Integer>  BancoSenha = new ArrayList<Integer>();
	
	public Autenticação(Conta conta) {
		this.conta = conta;
	}
	
	public void setestador(int estado) {
		this.estado = estado;
	}
	public int getEstado() {
		return estado;
	}
	
	
	private void AutenticaSenha() {
		BancoSenha.add(conta.senha);
		
	}
	private void AutenticaID() {
		BancoId.add(conta.Id);
	}
	public ArrayList<Integer> Senha() {
		return BancoSenha;
	}
	
	public  void Autenticação() {
		
		if(estado== 1) {
			for (String s :BancoId) {
			System.out.println(s);
			}
			
			for(int x : BancoSenha) {
			System.out.println(x);
			
			}
			
		}
		
		else {
			
		System.out.println("Login Ou senha Invalido(A)");
		
		}
		
	}
	
}
