
import java.util.*;

public class e4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca primer n�mero: ");
		int num1 = sc.nextInt();
		System.out.print("Introduzca segundo n�mero: ");
		int num2 = sc.nextInt();
		System.out.print("Introduzca tercer n�mero: ");
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("Mayor: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Mayor: " + num2);
		} else {
			System.out.println("Mayor: " + num3);
		}
	}
}
