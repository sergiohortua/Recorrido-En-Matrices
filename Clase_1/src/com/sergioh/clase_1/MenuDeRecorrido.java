package com.sergioh.clase_1;

import java.util.Scanner;

public class MenuDeRecorrido {

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("==MENU DE RECORRIDOS==");
			System.out.println("1. RECORRIDO VERTICAL");
			System.out.println("2. RECORRIDO HORIZONTAL");
			System.out.println("3. RECORRIDO EN Z");
			System.out.println("4. RECORRIDO EN N");
			System.out.print("ELIJA UNA OPCION ");
			int opc = tc.nextInt();
			switch (opc) {
			case 1:
				System.out.println();
				System.out.println("RECORRIDO VERTICAL");
				System.out.println();
				System.out.print("Digite el tama�o del arreglo: ");
				int tam = tc.nextInt();
				int arreglo[][] = new int[tam][tam];

				for (int fil = 0; fil < arreglo.length; fil++) {
					for (int col = 0; col < arreglo.length; col++) {
						System.out.print("Digite en la posicion [" + (fil + 1) + "," + (col + 1) + "] de la matriz: ");
						int pos = tc.nextInt();
						arreglo[fil][col] = pos;
					}

				}
				System.out.println();
				for (int[] is : arreglo) {
					for (int i : is) {
						System.out.print(i + " ");
					}
					System.out.println();
				}
				System.out.println();

				System.out.println("RECORRIDO VERTICAL: ");

				int col = 0;
				for (int rec = 1; rec < (arreglo.length + 1); rec++) {
					if (rec % 2 != 0) {
						for (int fil = 0; fil < arreglo.length; fil++) {
							System.out.print(arreglo[fil][col] + " ");

						}

					} else if (rec % 2 == 0) {
						for (int fil = (arreglo.length - 1); fil > -1; fil--) {
							System.out.print(arreglo[fil][col] + " ");

						}
					}

					col++;
				}

				System.out.println();

				break;
			case 2:
				System.out.println("horizontal");

				break;
			case 3:
				System.out.println("en z");

				break;
			case 4:
				System.out.println("en n");
				break;
			default:
				System.out.println("NO ES UNA OPCION VALIDA");

			}

			System.out.println("Desea elegir otro recorrido, 1->SI , 2->NO");
			op = tc.nextInt();
		} while (op == 1);

	}

}
