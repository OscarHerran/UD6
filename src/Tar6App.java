import java.util.Scanner;
//numero de cifras de un numero entero
public class Tar6App {

	public static void main(String[] args) {


		Scanner text = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingrese número");
		num = text.nextInt();
		
		verificaCifras(num);
		
		text.close();
	}
	
	public static void verificaCifras(int num) {
		String number = "";
		if(num > 0) {
			number = String.valueOf(num);
		} else {
			System.out.println("No es un entero positivo");
		}
		
		dameCifras(number);
	}
	
	public static void dameCifras(String number) {
		System.out.println("El número de cifras  es: " + number.length());
	}
}