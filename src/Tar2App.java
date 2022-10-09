import java.util.Scanner;
//numeros enteros aleatorios
public class Tar2App {

	public static void main(String[] args) {

		Scanner text = new Scanner(System.in);
		
		int total, valorA, valorB;
		int numerosAleatorios [];
		
		System.out.println("Ingrese el número de valores");
		total = text.nextInt();
		
		System.out.println("Ingrese el número de rango mínimo");
		valorA = text.nextInt();
		
		System.out.println("Ingrese el número de rango máximo");
		valorB= text.nextInt();
		
		numerosAleatorios = generaNumeros(total, valorA, valorB);// ADQUIERE EL VALOR DEL MÉTODO generaNumeros
		imprimeNumeros(numerosAleatorios);// muestra el resultado
		
		text.close();
	}

	
	public static int [] generaNumeros(int cantNumero, int valueA, int valueB) {
		
		int cantidad[] = new int [cantNumero];
		int num1 = valueA, num2 = valueB;
		
		for(int i = 0; i < cantidad.length; i++) {
			cantidad[i] = (int) (Math.random() * (num1-(num2+1))+(num2)) ;
		}
		
		return cantidad;
	}
	
	
	
	public static void imprimeNumeros(int [] arraus) {
		for(int aux : arraus) {
			System.out.println("Valor : " + aux);
		}
	}
	
}
