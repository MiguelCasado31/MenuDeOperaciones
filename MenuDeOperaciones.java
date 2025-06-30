package ejerciciosConFunciones;

import java.util.Scanner;

public class MenuDeOperaciones {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int eleccion;

		do {
			System.out.println("\nBienvenido al menú de operaciones.");
			System.out.println("Selecciona una de las opciones:");
			System.out.println("1. Hola Mundo");
			System.out.println("2. Suma de dos números");
			System.out.println("3. Número par o impar");
			System.out.println("4. Cuadrado de un número");
			System.out.println("5. Nombre y apellido");
			System.out.println("6. Factorial de un número");
			System.out.println("7. Mayor de tres números");
			System.out.println("0. Salir"); // Opción para salir

			System.out.print("Introduce tu elección: ");
			eleccion = scanner.nextInt();
			scanner.nextLine(); // Consume el resto de la línea

			switch (eleccion) {
			case 1:
				System.out.println("\n1. Hola Mundo");
				System.out.println("Se imprimirá un 'Hola Mundo' llamando a una función.");
				holaMundoConFuncion();
				break;

			case 2:
				System.out.println("\n2. Suma de dos números.");
				System.out.println("Se sumarán dos números que se pedirán por pantalla.");
				System.out.println("Introduce el primer número:");
				int num1 = scanner.nextInt();
				System.out.println("Introduce el segundo número:");
				int num2 = scanner.nextInt();
				int suma = sumaDosNumeros(num1, num2);
				System.out.println("La suma de " + num1 + " + " + num2 + " es = a " + suma);
				break;

			case 3:
				System.out.println("\n3. Número par o impar");
				System.out.println("Se determinará si el número que se pide por pantalla es par o impar.");
				System.out.println("Introduce un número:");
				int numeroParImpar = scanner.nextInt();
				numeroParImpar(numeroParImpar);
				break;

			case 4:
				System.out.println("\n4. Cuadrado de un número");
				System.out.println("Se calculará el cuadrado del número que se pase por pantalla.");
				System.out.println("Introduce un número:");
				int numeroCuadrado = scanner.nextInt();
				int cuadrado = cuadradoDeUnNumero(numeroCuadrado);
				System.out.println("El cuadrado del número " + numeroCuadrado + " es " + cuadrado);
				break;

			case 5:
				System.out.println("\n5. Nombre y Apellido");
				System.out.println("Se concatenará el nombre con el apellido que se pedirá por pantalla.");
				System.out.println("Escribe el nombre:");
				String nombre = scanner.nextLine();
				System.out.println("Escribe el apellido:");
				String apellido = scanner.nextLine();
				String resultado = nombreyApellido(nombre, apellido);
				System.out.println("Hola " + resultado);
				break;

			case 6:
				System.out.println("\n6. Factorial de un número");
				System.out.println("Se calculará el factorial de un número pedido por pantalla.");
				System.out.println("Introduce el número:");
				int numeroFactorial = scanner.nextInt();
				int factorial = factorial(numeroFactorial);
				System.out.println("El factorial de " + numeroFactorial + " es " + factorial);
				break;

			case 7:
				System.out.println("\n7. Mayor de tres números");
				System.out.println("Devolverá el mayor de los tres números pedidos por pantalla.");
				System.out.println("Introduce el primer número:");
				int n1 = scanner.nextInt();
				System.out.println("Introduce el segundo número:");
				int n2 = scanner.nextInt();
				System.out.println("Introduce el tercer número:");
				int n3 = scanner.nextInt();
				int mayor = mayorDeTres(n1, n2, n3);
				System.out.println("El mayor de " + n1 + ", " + n2 + " y " + n3 + " es: " + mayor);
				break;

			case 0:
				System.out.println("\nSaliendo del menú. ¡Hasta pronto!");
				break; 

			default:
				System.out.println("\nOpción no válida. Por favor, selecciona una opción del 0 al 7.");
				break;
			}
			if (eleccion != 0 && eleccion != 5) {

			}

		} while (eleccion != 0);
		scanner.close();
	}

	public static void holaMundoConFuncion() {
		// Implement the function logic here
		System.out.println("Hola Mundo");
	}

	public static int sumaDosNumeros(int a, int b) {
		// Implement the function logic here
		return a + b;
	}

	public static void numeroParImpar(int numero) {
		// Implement the function logic here
		if (numero % 2 == 0) {
			System.out.println("El número es par.");
		} else {
			System.out.println("El número es impar.");
		}
	}

	public static int cuadradoDeUnNumero(int numero) {
		// Implement the function logic here
		return numero * numero;
	}

	public static String nombreyApellido(String nombre, String apellido) {
		// Implement the function logic here
		return nombre + " " + apellido;
	}

	public static int factorial(int numero) {
		// Implement the function logic here
		if (numero == 0) {
			return 1;
		}
		int resultado = 1;
		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}
		return resultado;
	}

	public static int mayorDeTres(int a, int b, int c) {
		if (a >= b && a >= c)
			return a;
		else if (b >= c)
			return b;
		else
			return c;
	}

}
