package br.com.sysmanager.tests;

import br.com.sysmanager.objects.Criptografia;

public class CriptografiaTeste {

	public static void main(String[] args) {
		
		Criptografia cp = new Criptografia();
		
		System.out.println(cp.criptografarASCII("Victor Barros"));
		System.out.println(cp.descriptografarASCII("Ylfwru Eduurv"));
		
	}

}
