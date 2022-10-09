import javax.swing.*;
//convertidor de divisas
public class Tar7App {

	public static void main(String[] args) {

				
		iniciPrograma();
	}

		public static void iniciPrograma() {

			String moneda = JOptionPane.showInputDialog("Indique la cantidad de Euros");
			String eleccion = JOptionPane.showInputDialog("Indique la moneda: dolar, libras o yenes?");
			
			int cantidad = Integer.parseInt(moneda);
			
			eligeMoneda(eleccion, cantidad);// IMPERATIVO ANIDAR LOS MÉTDOS VOIDD PARA APROVECHAR EL ENCAPSULAMIENTO
		}
		
		public static void eligeMoneda(String eleccion, int cantidad) {

			switch(eleccion.toLowerCase()) {
				case "dolar":
					conversionDolar(cantidad);
					break;
				case "libras":
					conversionLibra(cantidad);
					break;
				case "yenes":
					conversionYenes(cantidad);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Debe de elegir una opción válida");
					break;			
			}
			
		}
		
		public static void conversionDolar(int cantidad) {
			double dolar = cantidad * 1.28611 ;
			JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " Euros, son : " + dolar + " $  dolares");
		}
		
		public static void conversionLibra(int cantidad) {
			double libra = cantidad * 0.86;
			JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " Euros, son : " + libra + " Libras");
		}
		
		public static void conversionYenes(int cantidad) {
			double yenes = cantidad * 129.852;
			JOptionPane.showMessageDialog(null, "La conversión de " + cantidad + " Euros, son : " + yenes + " Yenes");
		}
		
}