package br.com.sysmanager.objects;

public class NumerosPrimos {

	public int maiorPrimo(int numero1, int numero2) {
		
		int numeroMaior;
		int numeroMenor;

		// Qual o maior número

		if (numero1 > numero2) {
			numeroMaior = numero1;
			numeroMenor = numero2;

		} else {
			numeroMaior = numero2;
			numeroMenor = numero1;
		}
		
		// Laço p/ chegar ao maior numero primo
	
		while (numeroMaior > numeroMenor) {
			
			boolean primo = false;

			for (int i = numeroMaior - 1; i > 2; i--) {

				if (numeroMaior % i != 0) {
					primo = true;
				} else {
					primo = false;
					break;
				}
			}

			if (primo == true) {

				return numeroMaior;
			}
			
			numeroMaior--;

		}
		return 1;

	}

}
