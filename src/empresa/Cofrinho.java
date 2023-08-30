package empresa;
//Rafaele Cristina Cordeiro Leite Alves RU:4184392

import java.util.ArrayList;

public class Cofrinho {
	private double listaMoedas;

	ArrayList<Moeda> listamoedas = new ArrayList<Moeda>();

	public void adicionar(Moeda m) {
		listamoedas.add(m);
	}
	public void remover(Moeda m) {
		listamoedas.remove(m);
	}
	
	public void listar() {
		for (Moeda m: listamoedas) {         //Metodo para o info();
				m.info();
		}
	}
	public void totalConverter() {
		double total = 0;
		for (Moeda m: listamoedas) {
			total += m.converter();
		}
		System.out.printf("O Total convertido para real é:%.2f \n" ,total);
	}
	
	
	public double getListaMoedas() {
		return listaMoedas;
	}

	public void setListaMoedas(double listaMoedas) {
		this.listaMoedas = listaMoedas;
	}

	
	
	}
	
	
	
	

