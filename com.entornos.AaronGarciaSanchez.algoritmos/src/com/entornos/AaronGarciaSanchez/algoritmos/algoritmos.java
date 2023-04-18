package com.entornos.AaronGarciaSanchez.algoritmos;
/**
 * Esta clase implementa tres métodos estáticos utilizados para diferentes cálculos con Math.random(), llamados Fibonacci, Factorial y Primo.
 * @author aaron
 *  @version 1.0
 */
public abstract class algoritmos {
	
		/** 
		 * La secuencia de Fibonacci es una sucesión infinita de números naturales, que empieza con 0 y 1,
		 * siguiendo con la suma de los dos números anteriores hasta el infinito: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, etc..
		 * @param numero
		 * @return
		 */
		
		public static int Fibonacci (int numero) {
			int siguiente = 1, actual = 0, temporal = 0;
			for (int x = 1; x <= numero; x++) {
				temporal = actual;
				actual = siguiente;
				siguiente = siguiente + temporal;
			}
			return actual; 
		}
		/**
		 * Hacemos el factorial, que la utilizaremos para calcular combinaciones y permutaciones. 
		 * 	@param numero
		 * @return
		 * 
		 * 
		 */
		
		public static int Factorial (int numero) {
			if (numero < 0)
				numero = numero * -1;
			if (numero <= 0)
				return 1;
			int factorial = 1;
			while (numero > 1) {
				factorial = factorial * numero;
				numero--;
			}
			return factorial;
		}
		/** 
		 * Hacemos el primo, que la función tomará un número entero (de tipo int ) y devolverá 
		 * un booleano que dirá si el número es o no primo.
		 * @param numero
		 * @return
		 * 
		 */
		
		public static boolean Primo(int numero) {
			if (numero == 0 || numero == 1 || numero == 4) {
				return false;
			}
			for (int x = 2; x < numero / 2; x++) {
				if (numero % x == 0)
					return false;
			}
			return true;
		}
	}	



