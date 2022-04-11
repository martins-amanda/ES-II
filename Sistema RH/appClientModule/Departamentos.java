import java.util.ArrayList;
import java.util.List;

public class Departamentos {
	private int codigo;
	private String nome;
	private List<Funcionario> funcionarios = new ArrayList<>();
	private Empresa empresas;
	
	
	public Departamentos(int codigo, String nome, Empresa empresas) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.empresas = empresas;
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Empresa getEmpresas() {
		return empresas;
	}

	public void setEmpresas(Empresa empresas) {
		this.empresas = empresas;
	}

	public void addFuncionario(Funcionario funcionarios) {
		this.funcionarios.add(funcionarios);
		funcionarios.setDepartamentos(this);
	}

	public void removeFuncionario(Funcionario funcionarios) {
		this.funcionarios.remove(funcionarios);
	}

	public int qtdFuncionario() {
		return this.funcionarios.size();
	}
	@Override
    public String toString() {
        return this.nome;
    }
}
