package Lab2;

public class TestEncrypter {
    public static void main(String[] args) {
        String plaintext = "TH1S IS A SECRET MESSAGE";

        // Test 1 NUM COLUMNS 6:
        String ciphertext = Encrypter.encryptRowColumn(plaintext, 6);
        System.out.println(("Expected: TATGHSMEIEEXSCSXIRSXSEAX Actual: " + ciphertext));
        String decryptCipherText = Encrypter.decryptRowColumn(Encrypter.encryptRowColumn(plaintext,6), 6);
        System.out.println(("Expected: THISISASECRETMESSAGEXXXX Actual: " + decryptCipherText));

        // Test 2 NUM COLUMNS 20:
        String ciphertext2 = Encrypter.encryptRowColumn(plaintext, 20);
        System.out.println(("\nExpected: THISISASECRETMESSAGE Actual: " + ciphertext2));
        String decryptCipherText2 = Encrypter.decryptRowColumn(Encrypter.encryptRowColumn(plaintext,20), 20);
        System.out.println(("Expected: THISISASECRETMESSAGE Actual: " + decryptCipherText2));

        // Test 3 NUM COLUMNS 2:
        String ciphertext3 = Encrypter.encryptRowColumn(plaintext, 2);
        System.out.println(("\nExpected: TIIAERTESGHSSSCEMSAE Actual: " + ciphertext3));
        String decryptCipherText3 = Encrypter.decryptRowColumn(Encrypter.encryptRowColumn(plaintext,20), 20);
        System.out.println(("Expected: THISISASECRETMESSAGE Actual: " + decryptCipherText3));
    }
}
