package empresa;
//Rafaele Cristina Cordeiro Leite Alves RU:4184392

public class Dolar extends Moeda {

	
	
	public Dolar(double valor) {
		super(valor);
		this.valor = valor;
	}

	@Override
	void info() {
		System.out.println("Dolar - " + valor);
		
	}

	@Override
	double converter() {                              //Converção do valor
		double total = 4.96*valor;
		return total;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
	
	

	
	

}
