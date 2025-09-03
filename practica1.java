package tareas;

import java.util.*;

public class practica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[15];
		int num, neg;
		Scanner captura = new Scanner(System.in);
		
		for(int x = 0;x < numeros.length; x++) {
			System.out.println("DAME EL VALOR: " +x);
			num = captura.nextInt();
			numeros[x] = num;
		}
		for(int i = 0; i < numeros.length; i++) {
			// String n = numeros[i] %2 == 0 ? "hola" : "no";
			if (numeros[i] %2 == 0 && numeros[i] > 0) {
				
			}
		}
	}

}
