package programa;

public class contaBanco {

	public static void main(String[] args) {
		ContaBancaria contaAna = new ContaBancaria();
		
		ContaBancaria contaHector = new ContaBancaria();
		
		contaAna.depositar(1000);
		
		contaAna.sacar(500);
		
		System.out.println("saldo ana: " + contaAna.retornarSaldo());
		
		
		contaHector.depositar(0.01);
		
		contaHector.sacar(5000);
		
		System.out.println("saldo hector: " + contaHector.retornarSaldo());
		

	}

}
