package Lab3;

public class CaesarCipherEncrytption {
    public static void main(String[] args)
    {
        String plaintext = "THISI SASEC RETME SSAGE";

        System.out.println(encryptCaesarCipher(plaintext, 3));
    }

    public static String encryptCaesarCipher(String plaintext, int offset)
    {
        StringBuilder ciphertext = new StringBuilder();
        int originalPosition;
        int newPosition;
        char newCh;

        for(int i=0; i<plaintext.length(); i++)
        {
            char ch = plaintext.charAt(i);

            if(ch != ' ')
            {
                originalPosition = ch - 'A';
                newPosition = (originalPosition + offset) % 26;
                newCh = (char)('A' + newPosition);
                ciphertext.append(newCh);
            }
            else
                ciphertext.append(ch);
        }

        return ciphertext.toString();
    }
}
