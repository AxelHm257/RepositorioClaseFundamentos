import.java.util.Scanner;

public class Main{
	public static void public static void main(String[] args) {
	
		String cadena = "333", cadena2, cadena3;
		int entero = 3, entero2, entero3, numd;
		double decimal = 3.3, decimal2, decimal3;

		// Convertir cadena a entero 
		entero2 = Integer.parseInt(cadena);
		System.out.println(entero2);

		// Convertir double a flotante 
		entero3 = (int) decimal;
		System.out.println(entero3);

		//Convertir double a cadena
		cadena2 = String.valueOf(decimal);

		// Convertir int a double 
		decimal2 = Double.valueOf(entero);

		//Conversion Implícita 
		int i = 12;
		double numd = 1;
		System.out.println(numd);


		// 4. Solicitud de datos 
		Scanner scn new Scanner(System.in);

		System.out.println("Escribe una cadena:");
		String cadena = scn.nextLine();

		System.out.println("Escribe una numero entero:");
		int entero = scn.nextInt();

		System.out.println("Escribe un numero decimal:");
		double decimal = scn.nextDouble();

		System.out.println("numero decimal guardado"+ decimal);
		System.out.println("numero entero guardado"+ entero);
		System.out.println("cadena guardada"+ cadena);

		// 5- Boolean, operadores logico y de comparacion 
		System.out.println(10 > 9);
		System.out.println(10 == 9);
		System.out.println(10 < 9);
		System.out.println(10 >= 9);
		System.out.println(10 <= 9);
		System.out.println(10 != 9);

		// operadores logicos
		int x= 3;
		System.out.println(x< 5 && x >10);
		System.out.println(x< 5 || x >10);
		System.out.println(!(x<5 && x>10));
		System.out.println(!(x<5 || x>10));



	}

}