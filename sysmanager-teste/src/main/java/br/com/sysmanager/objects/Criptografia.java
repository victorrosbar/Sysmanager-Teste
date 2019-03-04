package br.com.sysmanager.objects;

public class Criptografia {

	public String criptografarASCII(String frase) {

		char[] cifraCesar = frase.toCharArray();

		for (int i = 0; i < cifraCesar.length; i++) {
			if (cifraCesar[i] != 32) {
				cifraCesar[i] += 3;
				if (cifraCesar[i] > 122 || cifraCesar[i] > 90 && cifraCesar[i] < 97) {
					cifraCesar[i] -= 26;
				}
			}
		}

		return new String(cifraCesar);

	}
	
	public String descriptografarASCII(String frase) {

		char[] cifraCesar = frase.toCharArray();
		
		
		for (int i = 0; i < cifraCesar.length; i++) {
			if (cifraCesar[i] != 32) {
				cifraCesar[i] -= 3;
				if (cifraCesar[i] < 65 || cifraCesar[i] > 90 && cifraCesar[i] < 97) {
					cifraCesar[i] -= 26;
				}
			}
		}

		return new String(cifraCesar);

	}

}
