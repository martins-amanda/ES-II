
public class Main {
	public static void main(String[] args) {

		Funcionario func1 = new Funcionario();
		func1.nome = "Amanda";
		func1.cpf = "123456-7";
		func1.qtdHoras = 9;
		func1.valorHora = 6.75;
		func1.salario = 0;

		func1.imprimir();

		Funcionario func2 = new Funcionario();
		func2.nome = "Lucas";
		func2.cpf = "765432-1";
		func2.qtdHoras = 6;
		func2.valorHora = 7.75;
		func2.salario = 0;

		func2.imprimir();

	}
}
