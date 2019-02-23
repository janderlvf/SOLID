	package SRP;
	
	public class CalculadoraDeSalario {
	
	public Double calcula(Funcionario funcionario) {
		return (((Cargo) funcionario.getCargo()).getRegra().calcula(funcionario));
	}
	}
