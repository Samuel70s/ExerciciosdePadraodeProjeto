package TesteCommander;

import java.util.Scanner;

public class Conta {
	Autenticação autenticacao = new Autenticação(null);
protected  static int senha;
protected  static  String Id;
Scanner s  = new Scanner(System.in);
public void  logarSenha() {
	
	System.out.println("Insira a sua senha:");
	this.senha = s.nextInt();
}
public void logarId() {
	System.out.println("Insira a sua ID:");
	this.Id = s.nextLine();
}

public  void Autentic() {
	if (Id=="Samuel" && senha==4338464) {
		
		autenticacao.Autenticação();
		autenticacao.setestador(1);
	}
	else {
	autenticacao.Autenticação();
	autenticacao.setestador(0);
	}
}

}
