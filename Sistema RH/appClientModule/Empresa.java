import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nome;
	private String cnpj;
	private List<Departamentos> departamentos = new ArrayList<>();

	public Empresa(String cnpj, String nome) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Departamentos> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(List<Departamentos> departamentos) {
		this.departamentos = departamentos;
	}

	public void addDepartamentos(Departamentos departamentos) {
		this.departamentos.add(departamentos);
	}

	public void removeDepartamentos(Departamentos departamentos) {
		this.departamentos.remove(departamentos);
	}

	public int qtdDepartamentos() {
		return this.departamentos.size();
	}

	public int qtdFuncionarios() {
		int funcionario = 0;
		for (Departamentos departamentos : this.departamentos) {
			funcionario += departamentos.qtdFuncionario();
		}
		return funcionario;

	}
	@Override
    public String toString() {
        return this.nome;
    }
}
