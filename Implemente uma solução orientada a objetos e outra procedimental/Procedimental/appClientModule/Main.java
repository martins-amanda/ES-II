import java.util.Scanner;

public class Main {
	static double CalcSalario(double qtdHora, double valorHora) {
		qtdHora = qtdHora * valorHora;
		return qtdHora;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Nome? ");
		String nome = in.nextLine();

		System.out.println("Cpf? ");
		String cpf = in.nextLine();

		System.out.println("Quantidade de horas trabalhadas? ");
		double qtdHora = in.nextDouble();

		System.out.println("Valor da Hora? ");
		double valorHora = in.nextDouble();
		CalcSalario(qtdHora, valorHora);

		System.out.println("Funcionário: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Salário: R$" + CalcSalario(valorHora, qtdHora));
	}
}