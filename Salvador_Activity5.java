package semister1;
import java.util.Scanner;
public class Salvador_Activity5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter X: ");
		
		int x = scanner.nextInt();
		
		System.out.println("Enter Y: ");
		
		int y = scanner.nextInt();
		
		int add = x+y;
		int subtract = x-y;
		int multiply = x*y;
		int qoutient = x/y;
		int modulos = x%y;
		
		
		System.out.println("Addition: "+add);
		System.out.println("Subtraction: "+subtract);
		System.out.println("Multiplication: "+multiply);
		System.out.println("Qoutient: "+qoutient);
		System.out.println("Modulos: "+modulos);
		
		
	}

}
