
// This is the logic that we will Test with out JUnits 

package _Caesar_cipher_SLDC;

public class CaesarCipher {
	private static final char LETTER_A = 'a';
	private static final char LETTER_Z = 'z';
	private static final int ALPHABET_SIZE = 26;

	public String cipher(String message, int offset) {
		offset %= ALPHABET_SIZE; // Avoid Overflow Alphabet Size -> offset = offset % ALPHABET_SIZE
		char[] character = message.toCharArray(); // Turn String into Char Array
		offsetby(character, offset);
		return new String(character);
	}

	private void offsetby(char[] character, int offset) {
		for (int i = 0; i < character.length; i++) {
			if (character[i] != ' ') {
				character[i] = offsetChar(character[i], offset, LETTER_A, LETTER_Z);
			}
		}

	}

	private char offsetChar(char c, int offset, char letterA, char letterZ) { // Only Handle Small letters
		c += offset;
		if (c < letterA) {
			return (char) (c + ALPHABET_SIZE);
		}
		if (c > letterA) {
			return (char) (c - ALPHABET_SIZE);
		}
		return c;
	}
}

