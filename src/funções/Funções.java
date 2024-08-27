package funções;

public class Funções {
	
	public Funções() {
		
	}
	
	private static void merge(int[] array, int inicio, int meio, int fim) {
		int t1 = meio - inicio + 1;
		int t2 = fim - meio;
		
		int[] arrayEsquerda = new int[t1];
		int[] arrayDireita = new int[t2];
		
		for(int i = 0; i < t1; i++) {
			arrayEsquerda[i] = array[inicio + i]; 
		}for(int j = 0; j< t2; j++) {
			arrayDireita[j] = array[meio + 1 + j];
		}
		int i = 0,j = 0;
		int k = inicio;
		
		while(i < t1 && j < t2) {
			if (arrayEsquerda[i] <= arrayDireita[j]) {
				array[k] = arrayEsquerda[i];
				i++;
			}else {
				array[k] = arrayDireita[j];
				j++;
			}
			k++;
		}
		while(i<t1) {
			array[k] = arrayEsquerda[i];
			i++;
			k++;
		}
		while(j<t2) {
			array[k] = arrayDireita[j];
			j++;
			k++;
		}
	}
	
	public static void sort(int array[], int inicio, int fim) {
		
		if(inicio<fim) {
			int meio = (inicio+fim) / 2;
			sort(array, inicio, meio);
			sort(array, meio+1, fim);
			merge(array,inicio,meio,fim);
		}
	}
	
	public static void mostrarArray(int array[]) {
		for (int i: array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	

}
