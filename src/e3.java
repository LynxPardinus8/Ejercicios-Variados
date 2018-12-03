
import java.util.*;

public class e3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca número entero positivo: ");
		int num = sc.nextInt();
		
		if (num > 9) {
			System.out.println("Tiene dos o más dígitos");
		} else {
			System.out.println("Tiene un dígito");
		}
	}
}
