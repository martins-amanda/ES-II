
public class Main {
	public static void main(String[] args) {

		Funcionario func1 = new Funcionario();
		Salario sal1 = new Salario();

		func1.nome = "Amanda";
		func1.cpf = "123456-7";
		sal1.qtdHoras = 9;
		sal1.valorHora = 6.75;
		sal1.salario = 0;

		func1.imprimir();
		sal1.imprimir();

		Funcionario func2 = new Funcionario();
		Salario sal2 = new Salario();
		func2.nome = "Lucas";
		func2.cpf = "765432-1";
		sal2.qtdHoras = 6;
		sal2.valorHora = 7.75;
		sal2.salario = 0;

		func2.imprimir();
		sal2.imprimir();

	}
}
