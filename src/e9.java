
import java.util.*;

public class e9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Introduzca segundo número: ");
		int num2 = sc.nextInt();
		System.out.print("Introduzca tercer número: ");
		int num3 = sc.nextInt();
		int resultado = (num1 + num2) * num3;
		
		if (num1 == num2 && num1 == num3) {
			System.out.println(resultado);
		} else {
			System.out.println("No son iguales");
		}
	}
}
