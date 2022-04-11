
public class Salario {
	double qtdHoras;
	double valorHora;
	double salario;

	public double getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(double qtdHoras) {
		this.qtdHoras = qtdHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	double calcSalario() {
		return salario = qtdHoras * valorHora;
	}

	void imprimir() {
		System.out.println("Quantidade de Horas Trabalhadas: "+ qtdHoras+" hrs"+
				"\nValor Hora: R$"+valorHora+ "\nSalário: R$" + calcSalario() + "\n");

	}
}
