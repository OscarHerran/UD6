import java.util.Scanner;
//Numero primo por teclado con metodo

public class Tar3App {

	public static void main(String[] args) {


		Scanner text = new Scanner(System.in);
		
		int num;
		
		System.out.println("Indique el número a evaluar");
		num = text.nextInt();
		
		if(evNum(num)) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número NO es primo");
		}
		
		text.close();
	}

	public static boolean evNum(int numero) {
		
		if(numero % 2 == 0) // VERIFICA SI ES DIVISIBLE ENTRE 2
			return false;
		
		for(int i = 3; i * i <= numero; i+=2) { // VERIFICA SI ES DIVISIBLE CON IMPARES
	        if(numero % i == 0)
	            return false;
	    }
	    return true; // SI NINGUNA CONDICION SE APLICA ES PRIMO
	}
	
	
}