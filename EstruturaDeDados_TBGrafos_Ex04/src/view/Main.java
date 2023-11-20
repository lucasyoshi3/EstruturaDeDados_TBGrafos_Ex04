package view;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Caminho do arquivo.txt com o grafo");
		String caminho=sc.next();
		
		/* Exemplo de caminho */
//		String caminho="/home/lucas/eclipse-workspace/LeituraArquivoTxt/ArquivoEx04.txt";
		
		try(BufferedReader leitor=new BufferedReader(new FileReader(new File(caminho)))){
			String linha;
			int linhaMatriz=0;
			linha=leitor.readLine();
			int tamanho=Integer.parseInt(linha);
			int grafo[][]=new int [tamanho][tamanho];
			while((linha=leitor.readLine())!=null) {
				String valores[]=linha.split(" ");
				for(int i=0;i<valores.length;i++) {
					grafo[linhaMatriz][i]=Integer.parseInt(valores[i]); 
					grafo[i][linhaMatriz]=grafo[linhaMatriz][i];
				}
				linhaMatriz++;
			}
			for(int i=0;i<tamanho;i++) {
				for(int j=0;j<tamanho;j++) {
					System.out.print(grafo[i][j]+" ");
				}
				System.out.println();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
