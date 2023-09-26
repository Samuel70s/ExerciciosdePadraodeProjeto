package TesteCommander;

public class LogarCommand implements Commander {
Conta conta = new Conta();
	
	public void execute() {
		conta.logarId();
		conta.logarSenha();
		conta.Autentic();
	}

}
