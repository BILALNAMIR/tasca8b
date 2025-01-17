package Tasca_8b;

/*Fes un programa que demani per pantalla la mida n de la matriu i generi una matriu de n x n i l’ompli de la següent manera: 
 * La posició (i, j) de la matriu ha de contenir i+j (la suma dels índex).  
 * Exemple matriu[1][3] = 4 . Un cop construïda la matriu cal mostrar-la per pantalla. Si la mida n és 4 hauria de sortir això:*/

import java.util.Scanner;
//hola
public class Tasca8b_1 {	
	public static void main(String[] args) {
		
	Scanner in = new Scanner (System.in);
	int valorI= 1;
	int valorJ= 1;
	int a = 0;
	int b = 0;

	System.out.println("Inroduix el numero d'elements que vols introduir");
	int numElements = in.nextInt();
	int mat1 []= new int [numElements];
	int mat2 []= new int [numElements];
	int calc = numElements*numElements;
	int calc2 =  calc - (numElements*2);
	int mat3 []= new int [calc];
	
	
	for (int i = 0;i<numElements; i++) {
		
		mat1 [i] = i;
	}for (int i = 0;i<numElements; i++) {
		
		mat2 [i] = i;
	}
	for (int i = 0; i<numElements-1;i++) {
		
		for (int s = 0 ; s<numElements-1;s++) {
		mat3 [a] = mat1[s+1] + mat2[valorJ];
		a++;
		}
		valorJ++;
	}
	
	for (int i = 0; i<numElements;i++) {
		System.out.print(mat1 [i]+ " ");
	}for (int i = 1; i<numElements;i++) {
		System.out.print("\n"+mat2 [i]+ " ");
		for(int s =0;s<numElements-1;s++) {
		System.out.print(mat3[b]+" ");
		b++;
		}
	}
	}
}
