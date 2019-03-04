package br.com.sysmanager.objects;

public class SequenciaFibonacci {

	private StringBuilder fibonacciSequence = new StringBuilder();

	public static long fibo(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}

	public StringBuilder fibonacciFinal(int numeroFinal) {
		
		if(numeroFinal >  2147483647) {
			throw new IndexOutOfBoundsException("Número inserido alto demais, favor inserir número menor");
		}
		
		for (int i = 0; SequenciaFibonacci.fibo(i) < numeroFinal; i++) {
			fibonacciSequence.append(SequenciaFibonacci.fibo(i) + " ");
		}
		
		return this.fibonacciSequence;
	}

}
