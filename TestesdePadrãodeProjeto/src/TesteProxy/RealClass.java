package TesteProxy;

import java.util.ArrayList;

public class RealClass implements ProxyMetodos {
	private String Usuarios;
	
	private  ArrayList  ListadeUsuarios = new ArrayList();
	
	private String  ListadeLogins;
	private ArrayList logins = new ArrayList();
	public RealClass() {
		ListadeUsuarios.add("Samuel");
		
	   ListadeLogins = ( " 49703410977");
	   logins.add(ListadeLogins);
	   
	   
	   }
	
	
	public ArrayList getListadeusuarios() {
		
		return ListadeUsuarios;
	}

	@Override
	public ArrayList getListadeLogins() {
		
		return logins ;
	}

}
