package Tasca_8b;
/*Fes un programa que generi una matriu de 10x10 aleatòriament amb enters entre 0 i 9.
 *  A continuació mostri la suma de cada fila i de cada columna com al següent exemple*/
import  java.util.Random;
public class Tasca8b_2 {

	public static void main(String[] args) {
		Random aleat = new Random();
		int nummat = (10*10);
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int mat1[]= new int [10*10];
		int matHorit [] = new int [10];
		int matVerti [] = new int [10];		
		
		for (int i = 0; i<nummat;i++) {
			int numAleat= aleat.nextInt(0,10);
			mat1[i]= numAleat;
		}
		
		
		// Aquesta part es per fer la suma en forma horitzontal.
		
		for (int i = 0; i<10;i++) {
					
			for (int s= 0; s<10;s++) {
				
				matHorit [i] += mat1[s+c];
			
			}
			c+=10;
						
		}
		//Aquesta part es per suma tots els numeros de forma vertical.
		
		for (int i = 0; i<10;i++ ) {
			
			for (int s = 0; s<10;s++) {
				matVerti [i]+= mat1 [b+i];
				b +=10;
			}
			b =0;
			
		}
		
		//Aquesta part es per organitzar els numros generat en files i columnes.
		
				for (int i = 0; i<10;i++) {
					
					for (int s= 0; s<10;s++) {
						System.out.print(mat1[a]+"  ");
						a++;
					}
					// Aquesta part es per escriure el resultat horitzontal.
					for(int l = 0 ; l<1;l++) {
					System.out.print("|" +matHorit[d]+"\n");
					d++;
					}
				}
				//Aquesta par es per omplir els resultats en vertical.
					
				System.out.println("------------------------------+");
				for(int i = 0;i<10;i++) {
					
					System.out.print(matVerti[i]+" ");
				}
	}

}
