package program;
import java.util.*;

public class calcVendaAnual {
	
	static String mesesDoAno[]={"-Janeiro   ","-Fevereiro ","-Março     ","-Abril     ","-Maio      ","-Junho     ","-Julho     ","-Agosto    ","-Setembro  ","-Outubro   ","-Novembro  ","-Dezembro  "};	
	
	static void imprimirMatriz(int[][]matriz) {		
		
		for (int i=0; i<matriz.length; i++) {	
			System.out.print(mesesDoAno[i]);
			for(int j=0; j<matriz[0].length; j++) {				
				System.out.print(matriz[i][j]+"\t");
			}			
			System.out.println();
			}
		System.out.println();
		}
		
	static void somaColunas(int[][]matriz) {		
		
		int somaC[]= new int [matriz.length];
		for (int j=0; j<matriz[0].length; j++) {
			for (int i=0; i<matriz.length; i++) {			
				somaC[j]+=matriz[i][j];
			}
			System.out.println ("Somátório de vendas nas semanas "+(j+1)+": "+somaC[j]+" unidades.");			
		}
	}
	
	public static void main (String[]args) {		
		Scanner leitor = new Scanner (System.in);
		
		int somaTotal=0;		
		int vendaAnual[][]= new int [12][4];		
		
		System.out.println("Insira os valores de vendas:\n");
		
		for (int i=0; i<vendaAnual.length; i++) {
			System.out.println(mesesDoAno[i]+":");
			for (int j=0; j<vendaAnual[0].length; j++) {				
				System.out.println("Semana "+(j+1)+":");
				vendaAnual[i][j]=leitor.nextInt();
			}
		}
		
		System.out.println("\t\t\tRelátorio de vendas do ano:\t\t\t");
		System.out.println("           S1	S2      S3      S4");
		imprimirMatriz(vendaAnual);
		somaColunas(vendaAnual);		
		
		for (int i=0; i<vendaAnual.length; i++) {
			for (int j=0; j<vendaAnual[0].length; j++) {
				somaTotal=somaTotal+vendaAnual[i][j];
			}
		}		
		System.out.println("\n\nValor total de vendas no ano: "+somaTotal+".");		
	}

}
