package programa;

import java.util.Scanner;

public class exercicio_FolhaPagamento {

	public static void main(String[] args) {
		
		//pega informações do usuario
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite quanto que voce ganha por hora: ");
		
		float valorHora = scanner.nextFloat();
		
		System.out.println("digite quantas horas se trabalha no mês: ");
		
		float horasTrabalhadas = scanner.nextFloat();
		
		float salarioBruto = valorHora * horasTrabalhadas;
		
		//chama o metodo
		
		Desconto Desconto = new Desconto(salarioBruto);
		
		Desconto.descontoSalario(salarioBruto);
		
	}

}
