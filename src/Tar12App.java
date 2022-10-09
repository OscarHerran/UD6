import javax.swing.JOptionPane;
//Array con numero que acaben en un digito
public class Tar12App {

	public static void main(String[] args) {


		dameDimension();
	}
	
	public static void dameDimension() {// MÉTODO QUE INICIA EL PROGRAMA
		String text = JOptionPane.showInputDialog("¿Cuántos valores desea? ");
		
		int dimension = Integer.parseInt(text);
		
		String numBusqueda = JOptionPane.showInputDialog("Introduce el dígito final a hallar ? ");
		
		int digito = Integer.parseInt(numBusqueda);
		
		if(digito < 0 || digito > 9) {// VERIFICA QUE SEA UN NÚMERO NATURAL Y SE ASEGURA DE SER ÚNICAMENTE 1 DÍGITO
			JOptionPane.showMessageDialog(null, "Introduce un número correcto");
		}

		int [] arrayDimension = new int [dimension];
		
		randomArray(arrayDimension, digito);//LLAMADA AL MÉTODO CON LOS PARÁMETROS A TRABAJAR
	}
	
	public static void randomArray(int [] arrayDimension, int digito) {
		int cont = 0;
		//PRIMER FOR PARA EVALUAR EL N{UMERO DE COINCIDENCIAS
		for(int i = 0; i < arrayDimension.length; i++) {
			arrayDimension[i] = (int) (Math.random() * (1 + 300) + 1);// LLENADO DEL ARRAY CON NÚMEROS RANDOM
				if(verificaDigito(arrayDimension[i], digito)) { // VERIFICO CONDICION CON EL MÉTODO 
					cont++;
			}
		}
		
		int [] ultimoDigito = new int [cont];// INSTANCIACIÓN DEL ARRAY QUE CONTENDRÁ LOS VALORES COINCIDENTES
		
			for(int i = 0; i < arrayDimension.length; i++) {//SEGUNDO RECORRIDO PARA ALMACENAR LOS VALORES COINCIDENTES EN EL ARRAY NUEVO
				if(verificaDigito(arrayDimension[i], digito)) {
					ultimoDigito[ultimoDigito.length - cont] = arrayDimension[i];// LA EXTENSIÓN VA EN DECRECIÓN DEL CONTADOR Y ADJUNTANDO LOS NÚMEROS COINCIDENTES
				}
			}
		
		imprimeArrays(arrayDimension, ultimoDigito, digito);// LLAMADA AL MÉTODO DE IMPRESIÓN DE LOS VALORES

	}
	
	public static boolean verificaDigito(int num, int digito) {// MÉTODO QUE VERIFICA SI EL DÍGITO ES O NO COINCIDENTE CON EL PARÁMETRO DISPUESTO POR TECLADO
		if(num % 10 == digito) { // VERIFICO CONDICION, EL RESIDUO DE UN NÚMERO DIVIDIDO ENTRE 10 NOS ARROJA EL ÚLTIMO VALOR
			return true;
		}
		
		return false;
	}

	//MÉTODO DE IMPRESIÓN DE LOS ARRAYS
	public static void imprimeArrays(int [] arrayDimension, int [] ultimoDigito, int digito) {
		System.out.println("El dígito a hallar en la colección es : " + digito);
		System.out.println("\n El array de números al azar entre 300 y 100 es: ");
		
		for(int numero : arrayDimension) {
			System.out.println("Valor = " + numero);
		}
		
			System.out.println("El array con números que contienen el último dígito son: ");
		
		for(int numero : ultimoDigito) {
			System.out.println("\n Valor = " + numero);
		}

	}
}