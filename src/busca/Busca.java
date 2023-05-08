package busca;

public class Busca {
	public void buscabinaria(int[] numbers, int wanted) {
		int start = 0;
		int end = numbers.length-1;
		int half = (start+end)/2;
		if(numbers[half] == wanted){
			System.out.println("\n\nO número procurado está na posição "+ half +" do vetor.");
		}else {
			while(start != end){
				if(numbers[half] > wanted){
					end = half-1;
				}else if(numbers[half] < wanted){
					start = half+1;	
				}
				half = (start+end)/2;
				if(numbers[half] == wanted){
					System.out.println("\n\nO número procurado está na posição "+ half +" do vetor.");
					break;
				}
			}
		}
	}
}
