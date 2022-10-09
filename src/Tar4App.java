import java.util.Scanner;

//Factorial de un Numero
public class Tar4App {

	public static void main(String[] args) {

		
		Scanner text = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingrese número");
		num = text.nextInt();
		
		System.out.println("El factorial del número es : " + Factorial(num));
		
		text.close();

	}

	public static int Factorial(int numero) {
		
		if(numero == 0)
			return 1;
		
		return numero * Factorial(numero - 1); 
	}
}