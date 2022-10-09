import java.util.Scanner;

public class Tar1App {
//Calcular Area de figuras 
	public static void main(String[] args) {

		Scanner text = new Scanner(System.in);
		
		String eleccion;
		
		System.out.println("¿A que figura le quiere calcular el Area?: triángulo, círculo o cuadrado");
		eleccion = text.next();
		
		System.out.println("El área de " + eleccion + " es igual a : " + verificaRespuesta(eleccion));
		
		text.close();
	}
	
	
	
	public static Double verificaRespuesta(String eleccion) {
		Scanner text = new Scanner(System.in);
		int num1, num2;
		double area = 0;
		
		if(eleccion.toLowerCase().equals("circulo")) {
			System.out.println("Ingrese el radio : ");
			num1 = text.nextInt();
			area = Math.PI * Math.pow(num1, 2);
		} else if(eleccion.toLowerCase().equals("cuadrado")) {
			System.out.println("Ingrese la base : ");
			num1 = text.nextInt();
			System.out.println("Ingrese la altura : ");
			num2 = text.nextInt();
			area = (num1 * num2) / 2;
		} else if(eleccion.toLowerCase().equals("triangulo")) {
			System.out.println("Ingrese ladoA : ");
			num1 = text.nextInt();
			System.out.println("Ingrese ladoB : ");
			num2 = text.nextInt();
			area = (num1 * num2);
		
		} else {
			System.out.println("ingrese una opcion válida");
		}
		
		text.close();
		return area;
	}
}