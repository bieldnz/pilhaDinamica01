package view;

import controllerDinamicas.PilhaVetor;

public class Principal {
	
	public static void main(String[] args) throws Exception {
		
		int[] vetor = {0, 5, 7, -4, 3, 5, -2, -1, 10, 4, 3, -6, 2, -9, 1, -5};
		
		PilhaVetor pilha = new PilhaVetor();
		System.out.println(pilha.calc(vetor));
		
	}
	
}
