package SRP;

public class DezOuVintePorCento implements RegraDeCalculo {

	@Override
	public double calcula(Funcionario f) {
		if(Funcionario.getSalarioBase() > 3000.0) {
			return Funcionario.getSalarioBase() * 0.8;
		}
		else {
			return Funcionario.getSalarioBase() * 0.9;
	}
}
}
