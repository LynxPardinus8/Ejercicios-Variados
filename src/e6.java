
import java.util.*;

public class e6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número entero positivo de hasta 3 cifras: ");
		int num = sc.nextInt();
		
		if (num > 9 && num <= 99) {
			System.out.println("Tiene 2 cifras");
		} else if (num > 99 && num <= 999) {
			System.out.println("Tiene 3 cifras");
		} else if (num >= 0 && num <= 9) {
			System.out.println("Tiene 1 cifra");
		} else {
			System.out.println("Tiene más de 3 cifras");
		}
	}
}
