package busca;

public class Principal {

	public static void main(String[] args) {
		Vetor numbers = new Vetor();
		numbers.preencherVetor();
		numbers.imprimirVetor("Original: ");
		
		Ordenacao ordenacao = new Ordenacao();
		ordenacao.insertSort(numbers.getVetor());
		
		Busca busca = new Busca();
		busca.buscabinaria(numbers.getVetor(), 7);
	}

}
