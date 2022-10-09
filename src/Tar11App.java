import javax.swing.JOptionPane;
//2 arrays con dimension pasada por teclado
public class Tar11App {

	public static void main(String[] args) {

		dimensionArrays();// METODO PRINCIPAL
	}

	public static void dimensionArrays() {
		String askArrayA = JOptionPane.showInputDialog("Indique la dimensión del array 1");
		
		int arrayAdimension = Integer.parseInt(askArrayA);
		
		int [] arrayA = new int [arrayAdimension];
		int [] arrayB = new int [arrayAdimension];
		
		rellenaArrayRandom(arrayA, arrayB);
	}
	
	public static void rellenaArrayRandom(int [] arrayA, int [] arrayB) {
		for(int i = 0; i < arrayA.length; i++) {
			arrayA[i] = (int) (Math.random() * (1 + 500) + 1);
			for(int j = 0; j < arrayB.length; j++) {
				arrayB[j] = (int) (Math.random() * (1 + 100) + 1);
			}
		}
		
		multiplicaArrays(arrayA, arrayB);
	}
	
	public static void multiplicaArrays(int [] arrayA, int [] arrayB) {
		//int [][] arraysMultiplicados = new int [arrayA.length][arrayB.length];// CREACION DE LA MATRIZ QUE RECIBE A AMBOS PARÁMETROS
		int [] multiplicacionArray = new int [arrayA.length];
		for(int i = 0; i < arrayA.length; i++) {
			multiplicacionArray[i] = arrayA[i] * arrayB[i];
		}
		
		imprimeArrays(arrayA, arrayB, multiplicacionArray);
	}
	
	public static void imprimeArrays(int [] arrayA, int [] arrayB, int [] multiplicacionArray) {
		System.out.println("Los arrays resultantes son: ");
		System.out.println("Array  1: ");
		
		for(int valoresA : arrayA) {
			System.out.println("Array  1: " + valoresA);
		}
		
		System.out.println("Array  2: ");
		
		for(int valoresB : arrayB) {
			System.out.println("Array  B: " + valoresB);
		}
		
		System.out.println("La multiplicación de los índices de ambos : ");
		
		for(int multiplicacionArrays : multiplicacionArray) {
			System.out.println("multiplicacion : " + multiplicacionArrays);
		}
	}
}