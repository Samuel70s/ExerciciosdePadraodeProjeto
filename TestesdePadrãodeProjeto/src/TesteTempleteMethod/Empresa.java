package TesteTempleteMethod;

public abstract class Empresa {
private String TemaJogo;
private String esteticadoJogo;
private boolean GratisOuPago;
private String PlatarformadeLançamento;
private int DatadeLançamento;

public final void executar() {
	Tema();
	Estica();
	gratisOUpago();
	Plataforlançamento();
	Datalançamento();
}
public abstract void Tema();
public abstract void Estica();
public abstract void gratisOUpago();
public abstract void Plataforlançamento();
public abstract void Datalançamento();

private void Plataforlançamento( String plataforma) {
	//Plaforma de lançamento
	this.PlatarformadeLançamento = plataforma;
	
}

private void Datalançamento(int data) {
	//Data de Lançamento
	this.DatadeLançamento = data;
	
}

private void gratisOUpago( boolean disponiblidade) {
	//true == Gratis false == Pago
	this.GratisOuPago = disponiblidade;
}

private void Estica(String estetica) {
	//Estetica do Jogo
	this.esteticadoJogo = estetica;
	
}

private void Tema(String tema) {
	//Data de Lançamento
   this.TemaJogo = tema;
	
}
}
