
public class Funcionario {
	private String nome;
	private String Cpf;
	private String cargo;
	private double salario;
	private Departamentos departamentos;

	public Funcionario(String nome, String cpf, String cargo, double salario, Departamentos departamentos) {
		super();
		this.nome = nome;
		Cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
		departamentos.addFuncionario(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Departamentos getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Departamentos departamentos) {
		this.departamentos = departamentos;
	}

}
