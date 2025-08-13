package _Caesar_cipher_SLDC;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCipherTest {
	
	private CaesarCipher caesarCipher = new CaesarCipher();

	@Test
	void testCipheredMessageWithOffset12() {
		assertEquals("Zai SdW kag Va[`Y faVSk" , caesarCipher.cipher("how are you doing today", 12));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("", caesarCipher.cipher("", 12));
	}
	

}
