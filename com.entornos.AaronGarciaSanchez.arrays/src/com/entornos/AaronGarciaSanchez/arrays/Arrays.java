package com.entornos.AaronGarciaSanchez.arrays;

/**
 * Método para calcular la media de un array de números enteros Recibe un array
 * de números enteros
 * 
 * @param array
 * 
 * @version 1.0
 * 
 * @author Aaron
 * 
 * @return
 * 
 **/
public abstract class Arrays {

	public static double media(int[] array) {
		int sumatorio = 0;
		for (int i = 0; i < array.length; i++) {
			sumatorio += array[i];
		}
		return (double) sumatorio / array.length;
	}

}
