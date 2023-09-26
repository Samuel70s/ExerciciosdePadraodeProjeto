package TesteProxy;

import java.util.ArrayList;

public class ProxyClass extends RealClass{
private String Usuario;
private String SenhaUsuario;
public ProxyClass(String usuario , String Senha ) {
	this.SenhaUsuario = Senha;
	this.Usuario = usuario;
	System.out.println(getListadeusuarios());
	System.out.println(getListadeLogins());
}

public  ArrayList getListadeusuarios() {
	if(Permissao()) {
		return super.getListadeusuarios();	
		}
	return null;
}
public ArrayList getListadeLogins() {
	if(Permissao()) {
		return super.getListadeLogins();
	}
	
	return null;


}

private boolean Permissao() {
	
	return Usuario=="Samuel" && SenhaUsuario == "4338464";
}

	
}
