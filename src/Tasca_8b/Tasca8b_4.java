package Tasca_8b;

/*Escriu un programa que demani quants números volem entrar (n). 
 * A continuació llegeixi n números enters entre 0 i 100 i conti les vegades que apareix cada número.
 */

import java.util.Scanner;
public class Tasca8b_4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digues quants números vols entre 0 i 100: ");
		int numMat = in.nextInt();
		int acomul = 0;
		int guar = 0;
		int res=0;
		
		int mat []= new int [numMat];
		int mat2 []= new int [numMat];
		int mat3 []= new int [numMat];

		
		for (int i = 0; i<numMat ; i++) {
			
			if(i==0 || i==2) {
			System.out.print("Entra el "+(i+1)+"r número:");
			}else if (i==1) {
				System.out.print("Entra el "+(i+1)+"n número:");
			}else if(i==3) {
				System.out.print("Entra el "+(i+1)+"t número:");
			}else {
				System.out.print("Entra el "+(i+1)+"è número:");
			}
			
			int numInto = in.nextInt();
			mat[i]= numInto;
			
			/*for(int s=0; s<numMat;s++) {
				
				if(numInto!= mat[s]) {
					acomul++;
				}if((numMat-1)==acomul) {
					mat3[guar]=mat[i];
					guar++;
				}
				
			}
			*/
			}
		
		System.out.println("---- RESULTAT ----");
		
		for (int i = 0;i<numMat;i++) {
			res=1;
			for(int s =0;s<numMat;s++) {
				if(mat[i]==mat[s] && s!=i) {
					res++;
					mat[s]=1988;
				}
			}
			System.out.println(mat[i]+" apareix "+ res + " vegades");
			
		}
		
		
		/*for(int i = 0; i<numMat; i++) {
			System.out.println(mat[i]+" apareix "+ mat2[i]+ " vegades");
			*/
		}
		
		 

	}


