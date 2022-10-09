import javax.swing.*;
public class Tar8App {
//Array de 10 valores
	public static void main(String[] args) {


		rValores();// inicia los metodos 
	}

	public static void rValores() {// MÉTODO DE LLENADO DEL ARRAY
		
		int [] numerosArray = new int[3]; 
		
		for(int i = 0; i < numerosArray.length; i++) {
			String respuesta = JOptionPane.showInputDialog("Ingrese valor : " + i);
			numerosArray[i] = Integer.parseInt(respuesta);
		}
		retornaValorArray(numerosArray);// ANIDAMIENTO DEL MÉTODO DE IMPRESIÓN
	}
	
	public static void retornaValorArray(int [] numerosArray) {// MÉTODO DE IMPRESION DEL ARRAY
		System.out.println("El array está compuesto por los siguentes valores: ");
		for(int i = 0; i < numerosArray.length; i++) {
			System.out.println("indice = " + i + " valor = " + numerosArray[i]);
		}
	}
}