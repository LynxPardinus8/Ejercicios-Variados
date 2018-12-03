
import java.util.*;

public class e2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca primera nota: ");
		int nota1 = sc.nextInt();
		System.out.print("Introduzca segunda nota: ");
		int nota2 = sc.nextInt();
		System.out.print("Introduzca tercera nota: ");
		int nota3 = sc.nextInt();
		int promedio = (nota1 + nota2 + nota3) / 3;
		
		if (promedio >= 7) {
			System.out.println("Promocionado");
		} else {
			System.out.println("No promocionado");
		}
		
	}
}
