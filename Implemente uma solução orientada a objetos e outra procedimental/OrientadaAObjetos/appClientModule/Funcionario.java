
public class Funcionario {
	String nome;
	String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	void imprimir() {
		System.out.println("Funcionário: " + nome + " \nCPF: " + cpf);
	}
}
