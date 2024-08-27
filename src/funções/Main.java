package funções;

public class Main {

	public static void main(String[] args) {
		int[] array = {7,34,12,56,22,9,6,4,98,67};
		System.out.println("Array original: ");
		Funções.mostrarArray(array);
		Funções.sort(array, 0, array.length-1);
		System.out.println("Array ordenado: ");
		Funções.mostrarArray(array);

	}

}
