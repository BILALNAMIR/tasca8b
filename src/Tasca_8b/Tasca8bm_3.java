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
public class Tasca8bm_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random aleat = new Random();
		
		char mat [][]= new char [5][5];
		int confirmChar = 0;
		int numcolum=0;
		int numfil=0;
		int contadorG1 = 0;
		int contadorG2 = 0;

		int contadorP = 0;
		
		int numAleatF1 = aleat.nextInt(0,5);
		int numAleatC1 = aleat.nextInt(0,5);
		
		int numAleatF2 = aleat.nextInt(0,5);
		int numAleatC2 = aleat.nextInt(0,5);
		
		while(numAleatF1==numAleatF2 && numAleatC1==numAleatC2 ) {
			
			numAleatF2 = aleat.nextInt(0,5);
			numAleatC2 = aleat.nextInt(0,5);
		}
		
		/*lllll*/
		
		System.out.print("  A B C D E \n");
		for(int i =0;i<5;i++) {
			System.out.print(i+1 );
			
			for (int c = 0;c<5;c++) {
				
				mat[i][c]= '*';
				System.out.print(" "+mat[i][c] );
				
			}
			System.out.println();
		} 

		while(contadorG1!=1 || contadorG2!=1 ) {
		
		System.out.println("Introduix una coordinada");
		String coord = in.nextLine().toUpperCase();
		int numelement = coord.length();
		
				
		while(numelement!=2 || confirmChar!=2){

			if(numelement<2 || numelement>2 ) {
			System.out.print("Incorrecte! torna a introduir una coordinada! ");
			coord = in.nextLine().toUpperCase();
			numelement = coord.length();
			}
		
			String fila = String.valueOf(coord.charAt(1));
				 numfil= Integer.parseInt(fila) - 1;
			char colum = coord.charAt(0);
			
			if (numfil<5 && 0<=numfil) {
				confirmChar++;
			}if(colum >64 && colum<=69) {
				confirmChar++;
				
			}if(confirmChar!=2) {
					numelement=0;
					confirmChar=0;
			}
				
		}
		confirmChar=0;
		// Convertir la lletre de columnes en numero i restar-li 1 per incorporar-se amb el index de la matriu.
		
		switch ((int)coord.charAt(0)) {
		
		case 65:
			numcolum=0;
			break;
		case 66:
			numcolum=1;
			break;
		case 67:
			numcolum=2;
			break;
		case 68:
			numcolum=3;
			break;
		case 69:
			numcolum=4;
			break;
			
		default:
			break;
		}
		
		if(numAleatF1==numfil && numAleatC1==numcolum) {
			
			mat [numfil][numcolum]= 'V';
			if(contadorG1==0) {
			contadorG1++;
			System.out.println(coord+" = TOCAT I ENFONSAT");
			}

		}else if (numAleatF2==numfil && numAleatC2==numcolum) {
			mat [numfil][numcolum]= 'V';
			if(contadorG2==0) {
				contadorG2++;
				System.out.println(coord+" = TOCAT I ENFONSAT");
				}
		}else {
			mat [numfil][numcolum]= 'A';
			contadorP++;
			System.out.println(coord+" = AIGUA");
			
			if(contadorP==23) {
				contadorG1=1; 
				contadorG2=1; 

			}
		}
		
		System.out.print("  A B C D E \n");
		for(int i =0;i<5;i++) {
			System.out.print(i+1 );
			
			for (int c = 0;c<5;c++) {
				
				
				System.out.print(" "+mat[i][c] );
				
			}
			System.out.println();
		} 
		}
		
		if(contadorP!=23) {
			
			System.out.println("ENHORABONA HAS TROBAT ELS DOS VAIXELLS EN " + (contadorP+2)+ " jugades");
		}else {
			System.out.println("HAS PERDUT!");
			
			System.out.print("  A B C D E \n");
			for(int i =0;i<5;i++) {
				System.out.print(i+1 );
				
				for (int c = 0;c<5;c++) {
					
					mat [numAleatF1][numAleatC1]= 'V';
					mat [numAleatF2][numAleatC2]= 'V';
					System.out.print(" "+mat[i][c] );
					
				}
				System.out.println();
			} 
			
		}
	
	}

}
