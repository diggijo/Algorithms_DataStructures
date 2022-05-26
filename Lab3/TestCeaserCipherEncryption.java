package Lab3;

public class TestCeaserCipherEncryption {
    public static void main(String[] args) {
        String plaintext = "THIS IS A SECRET MESSAGE";
        String plaintext2 = "HAPPY BIRTHDAY TO YOU";
        String plaintext3 = "JOSEPH DIGGINS";

        // Test 1 Offset 3:
        String ciphertext = CaesarCipherEncrytption.encryptCaesarCipher(plaintext, 3);
        System.out.println(("Expected: WKLV LV D VHFUHW PHVVDJH \nActual: " + ciphertext));

        // Test 2 Offset 35;
        String ciphertext2 = CaesarCipherEncrytption.encryptCaesarCipher(plaintext2, 35);
        System.out.println(("\nExpected: QJYYH KRACQMJH CX HXD \nActual: " + ciphertext2));

        // Test 3 Offset 0:
        String ciphertext3 = CaesarCipherEncrytption.encryptCaesarCipher(plaintext3, 0);
        System.out.println(("\nExpected: JOSEPH DIGGINS \nActual: " + ciphertext3));
    }
}
