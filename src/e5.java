
import java.util.*;

public class e5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("Negativo");
		} else if (num > 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Nulo");	
		}
	}
}
