
public class Main {
	public static void main(String[] args) {
		Empresa e1 = new Empresa("00.000.000/0001-01", "Empresa numero 01");
		Empresa e2 = new Empresa("00.000.000/0001-02", "Empresa numero 02");
		
		// Empresa 01 
		Departamentos RH = new Departamentos(001, "Recursos Humanos", e1);
		Departamentos ENG = new Departamentos(002, "Engenharia", e1);
		Departamentos MKT = new Departamentos(002, "Marketing", e1);
		Departamentos PP = new Departamentos(002, "Publicidade e propaganda", e1);
		e1.addDepartamentos(RH);
		e1.addDepartamentos(ENG);
		e1.addDepartamentos(MKT);
		e1.addDepartamentos(PP);
		
		System.out.printf("Empresa: %s  \nTotal de Departamentos: %d\n",e1.getNome(), e1.qtdDepartamentos());
		
		e1.removeDepartamentos(PP);
		
		
		
		Funcionario e1func01 = new Funcionario("João Silva", "123456-78", "Auxiliar de Projetos", 1500,ENG);
		Funcionario e1func02 = new Funcionario("Lucas Neco", "123456-78", "Auxiliar Marketing", 1200,MKT);
		Funcionario e1func03 = new Funcionario("Ana Maria", "123456-78", "Engenheira", 4500,ENG);
		Funcionario e1func04 = new Funcionario("Juliana Martins", "123456-78", "Consultora Marketing", 3500,MKT);

	
		System.out.printf("Total de Departamentos após atualização: %d\n", e1.qtdDepartamentos());
		System.out.printf("Total de funcionarios: %d\n", e1.qtdFuncionarios());
		
        System.out.println("\nNome: " + e1func01.getNome());
        System.out.println("Cargo: " + e1func01.getCargo());
        System.out.println("Salário: R$" + e1func01.getSalario());
        System.out.println("Departamento: " + e1func01.getDepartamentos());
        
        System.out.println("\nNome: " + e1func02.getNome());
        System.out.println("Cargo: " + e1func02.getCargo());
        System.out.println("Salário: R$" + e1func02.getSalario());
        System.out.println("Departamento: " + e1func02.getDepartamentos());
        
        System.out.println("\nNome: " + e1func03.getNome());
        System.out.println("Cargo: " + e1func03.getCargo());
        System.out.println("Salário: R$" + e1func03.getSalario());
        System.out.println("Departamento: " + e1func03.getDepartamentos());
        
        System.out.println("\nNome: " + e1func04.getNome());
        System.out.println("Cargo: " + e1func04.getCargo());
        System.out.println("Salário: R$ " + e1func04.getSalario());
        System.out.println("Departamento: " + e1func04.getDepartamentos());
	
        ENG.removeFuncionario(e1func03);
        
        System.out.printf("\nTotal de funcionarios após atualização: %d\n", e1.qtdFuncionarios());
        

		//Empresa 02 
		Departamentos RH2 = new Departamentos(001, "Recursos Humanos", e2);
		Departamentos ADM = new Departamentos(002, "Administração", e2);
		
		e2.addDepartamentos(RH2);
		e2.addDepartamentos(ADM);
		
		Funcionario e2func01 = new Funcionario("Joana Silva", "123456-78", "Administradora de Empresas", 3500,ADM);
		Funcionario e2func02 = new Funcionario("Leticia Silva", "123456-78", "Consultora de RH", 1500,RH2);
		
		System.out.printf("\nEmpresa: %s  \nTotal de Departamentos: %d\n",e2.getNome(), e2.qtdDepartamentos());
		System.out.printf("Total de funcionarios: %d\n", e2.qtdFuncionarios());
		
        System.out.println("\nNome: " + e2func01.getNome());
        System.out.println("Cargo: " + e2func01.getCargo());
        System.out.println("Salário: R$" + e2func01.getSalario());
        System.out.println("Departamento: " + e2func01.getDepartamentos());
        
        System.out.println("\nNome: " + e2func02.getNome());
        System.out.println("Cargo: " + e2func02.getCargo());
        System.out.println("Salário: R$" + e2func02.getSalario());
        System.out.println("Departamento: " + e2func02.getDepartamentos());
        
}
}