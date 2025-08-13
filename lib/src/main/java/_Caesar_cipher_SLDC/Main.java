package _Caesar_cipher_SLDC;

public class Main {

	public static void main(String[] args) {

		String message = "how are you doing today";
		int offset = 12;

		CaesarCipher caesarcipher = new CaesarCipher();

		System.out.println("Original Message: " + message);
		System.out.println("Encrypted Message: " + caesarcipher.cipher(message, offset));
		
		//Comment

	}

}
