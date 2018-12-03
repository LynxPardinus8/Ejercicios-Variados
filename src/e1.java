
import java.util.*;

public class e1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Introduzca segundo número: ");
		int num2 = sc.nextInt();
		int suma = num1 + num2;
		int diferencia = num1 - num2;
		int producto = num1 * num2;
		int division = num1 / num2;
		
		if (num1 > num2) {
			System.out.println("Suma: " + suma);
			System.out.println("Diferencia: " + diferencia);
		} else {
			System.out.println("Producto: " + producto);
			System.out.println("División: " + division);
		}
	}
}
