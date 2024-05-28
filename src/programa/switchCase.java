package programa;

public class switchCase {

	public static void main(String[] args) {
		int dia = 3;
		
		switch(dia) {
		
		case 1:{
			System.out.println("domingo");
			break;
		}
		case 2:{
			System.out.println("segunda");
			break;
		}
		case 3:{ 
			System.out.println("terça");
		}
		
		default:
		System.out.println("entre com um dia valido");
		}

	}

}
