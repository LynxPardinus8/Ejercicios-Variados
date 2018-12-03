
import java.util.*;

public class e10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Introduzca segundo número: ");
		int num2 = sc.nextInt();
		System.out.print("Introduzca tercer número: ");
		int num3 = sc.nextInt();
		
		if (num1 < 10 && num2 < 10 && num3 < 10) {
			System.out.println("Todos los números son menores a diez");
		} else {
			System.out.println("Uno o mas números son mayores a 10");
		}
	}
}
