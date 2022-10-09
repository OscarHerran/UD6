import java.util.Scanner;
//base decimal a binario

public class Tar5App {

	public static void main(String[] args) {
	

		Scanner texto = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingrese número");
		num = texto.nextInt();
		
		convierteaBinario(num);
		
	}

	public static void convierteaBinario(int num){
        int[] binario = new int[35]; // ARRAY QUE ALMACENARÁ EL RESULTADO
        int Operar = 0;
 
        while (num > 0) {// VERIFICA QUE EL NÚMERO SEA POSITIVO PARA EVALUAR
            binario[Operar++] = num % 2; // SUMA EL RESTO DE LA DIVISION DEL NÚUMERO
            num = num / 2;
        }
 
        printBinary(binario, Operar);// encapsula al otro método
    }
	
	
	 public static void printBinary(int[] binario, int sumaResto) {
	        for (int i = sumaResto - 1; i >= 0; i--) { //RECORRE LAS POSICIONES DE LA SUMA DEL RESTO
	            System.out.print(binario[i] + "");
	    }
	 }
}
