
import java.util.*;

public class e14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Introduzca segundo número: ");
		int num2 = sc.nextInt();
		System.out.print("Introduzca tercer número: ");
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("El mayor es " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("El mayor es " + num2);
		} else {
			System.out.println("El mayor es " + num3);
		}
		
		if (num1 < num2 && num1 < num3) {
			System.out.println("El menor es " + num1);
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("El menor es " + num2);
		} else {
			System.out.println("El menor es " + num3);
		}
	}
}
