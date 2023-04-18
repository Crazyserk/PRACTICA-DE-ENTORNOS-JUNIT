package com.entornos.AaronGarciaSanchez.algoritmos;

public class Principal {

	public static void main(String[] args) {
		
		//Vamos a crear la array vacía de 5 numeros
		int numeros[]= new int [5];
		// Metemos el bucle con números aleatorios entre 1 y 20.
		for(int i=0; i< numeros.length; i++) {
	     numeros[i] = (int) (Math.random() * (20 +1));
		}
		
		//Creamos otra array de 5 numeros
		int resultadoFibonacci[]= new int [5];
		// Almacenamos en otro array nuevo
		for (int i=0; i< numeros.length; i++) {
			resultadoFibonacci[i]=  (int) algoritmos.Fibonacci(numeros[i]);
		}
		//Creamos un array que se rellena con el factorial
				int resultadoFactorial[]= new int [5];
				//Almacenamos en el array nuevo
				for (int i=0; i<numeros.length; i++) {
					resultadoFactorial[i]= (int) algoritmos.Factorial(numeros[i]);
					
					
				//Creamos un array con introducción booleana
					boolean resultadoPrimos[]= new boolean [5];
					
					//Lo almacena	mos en el nuevo
					for (int j=0; j<numeros.length; j++) {
					resultadoPrimos[i]=  algoritmos.Primo(numeros[i]);
			}
				}
			}
		}


	
	



