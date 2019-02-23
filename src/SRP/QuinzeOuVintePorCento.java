package SRP;

public class QuinzeOuVintePorCento implements RegraDeCalculo {

	@Override
	public double calcula(Funcionario f) {
		if(Funcionario.getSalarioBase() > 2000.0) {
			return Funcionario.getSalarioBase() * 0.75;
		}
		else {
			return Funcionario.getSalarioBase() * 0.85;
			
		}
	}
	}
	


