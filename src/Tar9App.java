import javax.swing.JOptionPane;

//Array por teclado
public class Tar9App {

	public static void main(String[] args) {

		
		crearArrayDimension();// METODO PRINCIPAL
		
	}

	public static void crearArrayDimension() {// MÉTODO PARA CREAR LA DIMENSIÓN DEL ARRAY
		int dimensionArray;
		String queDimension = JOptionPane.showInputDialog("¿cuántos valores desea almacenar?");
		dimensionArray = Integer.parseInt(queDimension);
		int [] arrayNumbers = new int[dimensionArray];
		
		llenadoArray(arrayNumbers);
	}
	
	public static void llenadoArray(int [] arrayNumbers) {// LLENADO DEL ARRAY CON LOS VALORES RANDOM DE 0 A 9

		for(int i= 0; i < arrayNumbers.length; i++) {
			arrayNumbers[i] = (int) (Math.random() * 9);
		}
		
		imprimeArray(arrayNumbers);// LLAMADO A LOS MÉTODOS
		sumaArray(arrayNumbers);
	}
	
	public static void imprimeArray(int [] arrayNumbers) {// MÉTODO PARA IMPRIMIR EL ARRAY
		System.out.println("El array dispone de los siguientes índices : " );
		for(int i = 0; i < arrayNumbers.length; i++ ) {
			System.out.println("índice = " + i + "  valor = " + arrayNumbers[i] );
		}
	}
	
	public static void sumaArray(int [] arrayNumbers) {// MÉTOO PARA SUMAR EL ARRAY
		int sumaTotal = 0;
		for(int suma : arrayNumbers) {
			sumaTotal += suma;
		}
		System.out.println("La suma del array es " +  sumaTotal);
	}
}