
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
		System.out.println("Funcion�rio: " + nome + " \nCPF: " + cpf + 
				"\nSal�rio: R$" + calcSalario() + "\n");
	}
}
