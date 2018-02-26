package com.ssbaez.ejercicio417;

import java.util.Scanner;

public class GasKM {
	
	public static void main(String[] args){
		
		int km = 0;
		int lt = 0;
		int in1 = 0;
		int in2 = 0;
		int i = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("== Programa que calcula los km por litro de cada viaje e imprime"
							+ " el total de km por lt obtenidos en todos los viajes ==");
		
		while(in1 != -1){
			
			System.out.print("\n---> Ingrese los km conducidos o -1 paraterminar: ");
			in1 = input.nextInt();
			
			if(in1 >= 0){
			
				km += in1;
				i++;
				
				System.out.print("---> Ingrese los Lt usados: ");
				in2 = input.nextInt();
				lt += in2;
				
				float trip = (float)in2 / in1;
				System.out.printf("Km por Lt del viaje: %.2f lt/km\n", trip);
				
			}//Fin de If 1
			
		}//Fin de while 1
		
		float trip = (float) lt / km;
		System.out.printf("Kilometros por litro obtenidos en %d viaje(s): %.2f lt/km", i, trip);
		
	}//Fin del metodo main

}//Fin de declaracion de clase
