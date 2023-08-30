package empresa;
//Rafaele Cristina Cordeiro Leite Alves RU:4184392

public class Real extends Moeda {
	
	
	public Real(double valor) {
		super(valor);
		this.valor = valor;
	}

	@Override
	void info() {
		
		System.out.println("Real - " + valor);		
	}

	@Override
	double converter() {                   //Converção do valor
		double total = valor;
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
