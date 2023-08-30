package empresa;
//Rafaele Cristina Cordeiro Leite Alves RU:4184392
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		Cofrinho cofrinho = new Cofrinho();

		
		System.out.println("-----Cofrinho-----"); // Menu Principal
		System.out.println("1 - Adicionar Moedas");
		System.out.println("2 - Remover Moedas");
		System.out.println("3 - Listar Moedas");
		System.out.println("4 - Total de moedas convertido");
		System.out.println("0 - Encerrar");
		opcao = teclado.nextInt();
		
		int tipoMoeda;
		Moeda moeda;
		while (opcao != 0) {
			switch (opcao) {
			
			case 1: //Para adicionar a moeda
				tipoMoeda=0;
				while (tipoMoeda>3 || tipoMoeda<=0) {
					System.out.println("Escolha a moeda:");
					System.out.println("1 - REAL");
					System.out.println("2 - DOLAR");
					System.out.println("3 - EURO");
					tipoMoeda = teclado.nextInt();
					}
				
				moeda = null;
				if(tipoMoeda == 1) {
					System.out.println("Digite o valor:");
					double valor = teclado.nextDouble();
					moeda = new Real(valor);
				}
				else if(tipoMoeda == 2) {
					System.out.println("Digite o valor:");
					double valor = teclado.nextDouble();
					moeda = new Dolar(valor);
				}
				else if(tipoMoeda == 3) {
					System.out.println("Digite o valor:");
					double valor = teclado.nextDouble();
					moeda = new Euro (valor);
				}
				cofrinho.adicionar(moeda);
				
				break;
			case 2: // Para remover a moeda
				tipoMoeda=0;
				while (tipoMoeda>3 || tipoMoeda<=0) {
					System.out.println("Escolha a moeda:");
					System.out.println("1 - REAL");
					System.out.println("2 - DOLAR");
					System.out.println("3 - EURO");
					tipoMoeda = teclado.nextInt();
					}
				
				moeda = null;
				if(tipoMoeda == 1) {
					System.out.println("Digite o valor:");
					double valor = teclado.nextDouble();
					moeda = new Real(valor);
				}
				else if(tipoMoeda == 2) {
					System.out.println("Digite o valor:");
					double valor = teclado.nextDouble();
					moeda = new Dolar(valor);
				}
				else if(tipoMoeda == 3) {
					System.out.println("Digite o valor:");
					double valor = teclado.nextDouble();
					moeda = new Euro (valor);
				}
				cofrinho.remover(moeda);
				break;
			case 3: // listar a moeda 
				cofrinho.listar();
				
				break;
			case 4: // Converter a moeda 
				cofrinho.totalConverter();
				break;	
			default:
				System.out.println("Opção Invalida! Escolha uma das opções:");
			}
			
			System.out.println("-----Cofrinho-----");
			System.out.println("1 - Adicionar Moedas");
			System.out.println("2 - Remover Moedas");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Total de moedas convertido");
			System.out.println("0 - Encerrar");
			opcao = teclado.nextInt();
			
			
		}
	System.out.println("Cofrinho Finalizado!");}
	
}
