package programa;

public class bibliotecaMath {

	public static void main(String[] args) {
		int num1 = 9;
		int num2 = 17;
		
		int biggestNumba = Math.max(num1, num2);
		
		int smallestNumba = Math.min(num1, num2);
		
		double raiz = Math.sqrt(smallestNumba);
		
		System.out.println("o maior numero é: "+ biggestNumba);
		System.out.println("o menor numero é: " + smallestNumba);
		System.out.println("a raiz do menor numero é: " + raiz);
	}

}
