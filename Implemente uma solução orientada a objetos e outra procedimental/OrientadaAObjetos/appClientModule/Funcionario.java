
public class Funcionario {
	String nome;
	String cpf;
	double qtdHoras;
	double valorHora;
	double salario;

	double calcSalario() {
		return salario = qtdHoras * valorHora;
	}

	void imprimir() {
		System.out.println("Funcionário: " + nome + " \nCPF: " + cpf + 
				"\nSalário: R$" + calcSalario() + "\n");
	}
}
