
import java.util.*;

public class e11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Introduzca segundo número: ");
		int num2 = sc.nextInt();
		System.out.print("Introduzca tercer número: ");
		int num3 = sc.nextInt();
		
		if (num1 < 10 || num2 < 10 || num3 < 10) {
			System.out.println("Alguno de los números es menor a diez");
		} else {
			System.out.println("Los números son mayores a 10");
		}
	}
}