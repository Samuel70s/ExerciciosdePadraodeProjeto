package Teste2Interetor;

public class Main {

	public static void main(String[] args) {
		
		 
		Repassador[] carg0 = new Repassador[7];
		//Instacias de Funcionarios
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		Funcionario funcionario3 = new Funcionario();
		Funcionario funcionario4  = new Funcionario();
		Funcionario funcionario5 = new Funcionario();
		Funcionario funcionario6 = new Funcionario(); 
		
		// New Funcionarios E New Estagiarios
		funcionario.setNome("Ivan");
		funcionario.setRepassadordeCargo("Funcionario");
		funcionario.setRepassarSalario(2000);
		
	    funcionario1.setNome("Samuel");
		funcionario1.setRepassadordeCargo("Estagiario");
		funcionario1.setRepassarSalario(800);
		
		
		
		funcionario2.setNome("Marlon");
		funcionario2.setRepassadordeCargo("Estagiario");
		funcionario2.setRepassarSalario(800);
		
		
		funcionario3.setNome("Saintclair Maia Miranda");
		funcionario3.setRepassadordeCargo("Funcionario fixo");
		funcionario3.setRepassarSalario(4000);
		
		
		funcionario4.setNome("Dilama Santos Moreira");
		funcionario4.setRepassadordeCargo("Funcionaria fixa");
		funcionario4.setRepassarSalario(4000);
		
		
		funcionario5.setNome("Nathan");
		funcionario5.setRepassadordeCargo("Funcionario fixo");
	    funcionario5.setRepassarSalario(1000000000);
	    
	    funcionario6.setNome("Joca");
	    funcionario6.setRepassadordeCargo("Funcionario fixo");
	    funcionario6.setRepassarSalario(3000);
	    
		
		
		//Instaciamento das Arrays (Obrigatorio)
	    
	    carg0[0] = new Repassador();
	    carg0[1] = new Repassador();
	    carg0[2] = new Repassador();
	    carg0[3] = new Repassador();
	    carg0[4] = new Repassador();
	    carg0[5] = new Repassador();
	    carg0[6] = new Repassador();
	    
	
	   //Adicionando os Funcionarioa e Os Estagiarios
	    
	    carg0[0].setNome(funcionario.getNome());
		carg0[0].setRepassadordeCargo(funcionario.getRepassadordeCargo());
		carg0[0].setRepassarSalario(funcionario.getRemuneração());
		
		
		carg0[1].setNome(funcionario1.getNome());
		carg0[1].setRepassadordeCargo(funcionario1.getRepassadordeCargo());
		carg0[1].setRepassarSalario(funcionario1.getRemuneração());
		
		carg0[2].setNome(funcionario2.getNome());
		carg0[2].setRepassadordeCargo(funcionario2.getRepassadordeCargo());
		carg0[2].setRepassarSalario(funcionario2.getRemuneração());
		
		carg0[3].setNome(funcionario3.getNome());
		carg0[3].setRepassadordeCargo(funcionario3.getRepassadordeCargo());
		carg0[3].setRepassarSalario(funcionario3.getRemuneração());
		
		carg0[4].setNome(funcionario4.getNome());
		carg0[4].setRepassadordeCargo(funcionario4.getRepassadordeCargo());
		carg0[4].setRepassarSalario(funcionario4.getRemuneração());
		
		carg0[5].setNome(funcionario5.getNome()); 
		carg0[5].setRepassadordeCargo(funcionario5.getRepassadordeCargo());
		carg0[5].setRepassarSalario(funcionario5.getRemuneração());
		
		carg0[6].setNome(funcionario6.getNome());
		carg0[6].setRepassadordeCargo(funcionario6.getRepassadordeCargo());
		carg0[6].setRepassarSalario(funcionario6.getRemuneração());
		
		
		Iterator cargos = new ImplementsIterator(carg0);
		
		
	
	while(cargos.HashNext()) {
		Repassador cliente = (Repassador) cargos.next();
		System.out.println(" Nome: "+ cliente.getNome() + "\n"+
		" Cargo: " + cliente.getRepassadordeCargo()+ "\n"+
		" Salario: "+cliente.getRemuneração()+"\n"+"----------------------"
		);
	}
	}

}


