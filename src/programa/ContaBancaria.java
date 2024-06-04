package programa;

public class ContaBancaria {
	
	public double saldo = 0;
	
			
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void sacar(double valor) {
		if((this.saldo - valor) < 0) {
			System.out.println("nao pode sacar o valor" + valor + ", pois exedera o limite de saldo");
		}
		else{
			System.out.println("sacado: " + valor);
			this.saldo -= valor;
		}
		
	}
	
	
	public double retornarSaldo() {
		return this.saldo;
	}
	
	
}
