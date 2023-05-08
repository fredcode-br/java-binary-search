package busca;

public class Ordenacao {
	public void insertSort(int numbers[]) {
		int aux = 0;
		for(int i = 0; i < numbers.length-1; i++) {
			if(numbers[i] > numbers[i+1]) {
				aux = numbers[i];
				numbers[i] = numbers[i+1];
				numbers[i+1] = aux;
			}
			for(int j = i; j > 0; j--) {
				if(numbers[j] < numbers[j-1]) {
					aux = numbers[j];
					numbers[j] = numbers[j-1];
					numbers[j-1] = aux;
				}
			}
		}
	}
}
