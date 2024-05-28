package programa;

public class Desconto {
	float ir;
	float sindicato;
	float fgts;
	float salarioBruto;
	float salarioLiquido;
	
	public Desconto(float salarioBruto) {
		 this.salarioBruto = salarioBruto;
	}
	
	public void descontoSalario(float salarioBruto) {
		if (salarioBruto <= 900) {
			
			float sindicato = (3f / 100) * salarioBruto;
			
			float fgts = (11f / 100) * salarioBruto;
			
			float salarioLiquido = salarioBruto - sindicato - fgts;
			
			System.out.println("o seu salario bruto é: " + salarioBruto + " descontado impostos, é: " + salarioLiquido);
		}
		
		else if (salarioBruto <= 1500 && salarioBruto > 900) {
			
			float ir = (5f / 100) * salarioBruto;
			
			float sindicato = (3f / 100) * salarioBruto;
			
			float fgts = (11f / 100) * salarioBruto;
			
			float salarioLiquido = salarioBruto - sindicato - fgts - ir;
			
			System.out.println("o seu salario bruto é: " + salarioBruto + " descontado impostos, é: " + salarioLiquido);
		}
		
		else if (salarioBruto <= 2500 && salarioBruto > 1500) {
			
			float ir = (10f / 100) * salarioBruto;
			
			float sindicato = (3f / 100) * salarioBruto;
			
			float fgts = (11f / 100) * salarioBruto;
			
			float salarioLiquido = salarioBruto - sindicato - fgts - ir;
			
			System.out.println("o seu salario bruto é: " + salarioBruto + " descontado impostos, é: " + salarioLiquido);
		}
		
		else if (salarioBruto > 2500) {
			
			float ir = (20f / 100) * salarioBruto;
			
			float sindicato = (3f / 100) * salarioBruto;
			
			float fgts = (11f / 100) * salarioBruto;
			
			float salarioLiquido = salarioBruto - sindicato - fgts - ir;
			
			System.out.println("o seu salario bruto é: " + salarioBruto + " descontado impostos, é: " + salarioLiquido);
		}
		
	}
	
}


