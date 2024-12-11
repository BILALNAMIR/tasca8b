package Tasca_8b;
/*Millora el joc dels vaixells que vas fer en la tasca7: Utilitza 5 files i 5 columnes  i amaga 2 vaixells. 
 * També cal que vagis mostrant les caselles on hi ha aigua després de cada jugada. El joc s'acaba quan s'han trobat els 2 vaixells Ex:

    A B C D E
  1 * * * * *
  2 * A * * V
  3 * * * A *
  4 * * A * *
  5 * * * * *
*/
import java.util.Scanner;
import java.util.Random;
public class Tasca8b_3 {

	public static void main(String[] args) {

		Scanner in ; new Scanner(System.in);
		Random aleat = new Random();
		int a = 65;
		char numfila= '1';
		
		int acomulV=0;
		
		char mat1 []= new char [5];
		char mat2 []= new char [5];
		char mat3 []= new char [5*5];
		
		//Aquest par es per omplir les files en lletres.
		for(int i =0 ;i<5;i++) {
			mat1[i]= (char)a;
			a++;
		}
		
		//Aquest part es per omplir els les columnes en numeros.
		for (int i =0; i<5;i++) {
			mat2[i] = numfila;
			numfila++;
			
		}
		
		//Aquest part es per debuixar els esterics.
		for (int i =0; i<(5*5);i++) {
			mat3[i]= '*';
			
		
		}
		
		
		//aquespart es per debuixar tot el que he creat.
		System.out.print(" ");
		for(int i =0;i<5;i++) {
			
			System.out.print(" "+mat1[i]);
		}
		System.out.println();

		//Aquest part es per debuixar els esterics.
		for (int i = 0; i<5;i++) {
			System.out.print(mat2[i]+" "); //Aquest part es per debuixar les columnes en numeros.

			for(int s = 0 ; s<5;s++) {
				
				System.out.print(mat3[i]+" ");

			}
			System.out.println();
			
		}
		
	
		
		
		
		
		
		
		
	}

}
