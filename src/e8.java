
import java.util.*;

public class e8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca d�a del mes: ");
		int dia = sc.nextInt();
		System.out.print("Introduzca mes del a�o: ");
		int mes = sc.nextInt();
		
		if (dia == 25 && mes == 12) {
			System.out.println("Es Navidad");
		} else {
			System.out.println("No es Navidad");
		}
	}
}
