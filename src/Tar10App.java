import javax.swing.JOptionPane;
//ARRAY ALEATORIO POR TECLADO
public class Tar10App {

	public static void main(String[] args) {

		dimensionArray();//METODO PRINCIPAL

	}

	public static void dimensionArray() {
		
		String text = JOptionPane.showInputDialog("Indique la dimensión del array que desee ");
		int dimension = Integer.parseInt(text);
		int [] arrayPrimos = new int [dimension];	
		generaArrayPrimos(arrayPrimos);
	}
	
	public static void generaArrayPrimos(int [] arrayPrimos) {

		for(int i = 0; i < arrayPrimos.length; i++) {
			arrayPrimos[i] = (int) (Math.random() * (1 + 1000) + 1);
			if(isPrime(i)) {// VERIFICA CON EL BOOLEAN SI EL NÚMERO RANDOM ES O NO PRIMO
				arrayPrimos[i] = i;
			}
		}
		
		imprimePrimos(arrayPrimos);
		primoMayor(arrayPrimos);
	}
	
	public static void imprimePrimos(int [] arrayPrimos) {// IMPRIME EL ARRAY DE PRIMOS
		System.out.println("El array de primos es : " );
		for(int primo : arrayPrimos) {
			System.out.println("Primo : " + primo);
		}
	}
	
	public static boolean isPrime(int n) {// MÉTODO PARA VERIFICAR SI U NÚMERO ES O NO PRIMO
	   
	    if (n % 2 == 0) return false;//EVALUA SI ES PAR
	  
	    for(int i = 3; i * i <= n; i += 2) {//EVALUA SI ES UN IMPAR
	        if(n % i == 0)
	            return false;
	    }//EN CASO DE QUE AMBAS CONDICIONES RETORNE FALSO, ERGO ES PRIMO PUES SOLO ES DIVISIBLE POR SI MISMO
	    return true;
	}
	
	public static void primoMayor(int [] arrayPrimos) {// MÉTODO PARA HALLAR EL NÚMERO MAYOR DEL ARRAY
		int mayor = arrayPrimos[0];//VALOR PRIMERA POSICION DEL ARRAY A LA VARIABLE
		for(int num : arrayPrimos) {
			if(num > mayor) {// VERIFICACION CON LA VARIABLE Y UBICACION DEL MAYOR ELEMENTO
				mayor = num;
			}
		}
		
		System.out.println("El número primo mayor es : " + mayor);//IMPRESIÓN DEL MAYYOR ELEMENTO
	}
}