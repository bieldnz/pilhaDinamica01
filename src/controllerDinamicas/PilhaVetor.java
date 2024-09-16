package controllerDinamicas;
import controllerPilha.ControllerPilha;


public class PilhaVetor {
	
	public int calc(int[] vetor) throws Exception {
		
		int soma = 0;
		int tamanho = vetor.length;
		ControllerPilha pilha = new ControllerPilha(null);
		
		for(int x = 0; x < tamanho; x++) {
			if(vetor[x] >= 0) {
				pilha.push(vetor[x]);
			}if(vetor[x] < 0) {
				soma = pilha.pop();
				soma += pilha.pop();
				pilha.push(vetor[x]);
				pilha.push(soma);
			}
		}
		
		return pilha.size();
	}
	
}
