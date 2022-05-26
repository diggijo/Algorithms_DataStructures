package Lab2;

import javax.swing.*;

public class Encrypter {
    public static void main(String[] args) {
        String plaintext = "THISI SASEC RETME SSAGE";
        String text, text2;
        int numColumns;

        numColumns = Integer.parseInt(JOptionPane.showInputDialog("How many columns do you require?"));
        text = encryptRowColumn(plaintext, numColumns);

        JOptionPane.showMessageDialog(null, text, "CipherText", JOptionPane.INFORMATION_MESSAGE);

        text2 = decryptRowColumn(encryptRowColumn(plaintext, numColumns), numColumns);

        JOptionPane.showMessageDialog(null, text2, "CipherText", JOptionPane.INFORMATION_MESSAGE);
    }

    public static String encryptRowColumn(String plainText, int numColumns)
    {
        StringBuilder ciphertext = new StringBuilder();
        StringBuilder newPlainText;
        int numRows;

        newPlainText = new StringBuilder(plainText.replace(" ", ""));

        do{
            if(newPlainText.length() % numColumns != 0)
            {
                newPlainText.append('X');
            }

        }while(newPlainText.length() % numColumns != 0);

        numRows = newPlainText.length() / numColumns;

        for(int col=0; col<=numColumns-1; col++)
        {
            int index = col;

            for(int row=0; row <=numRows-1; row++)
            {
                ciphertext.append(newPlainText.charAt(index));
                index += numColumns;
            }
        }

        return ciphertext.toString();
    }

    public static String decryptRowColumn(String cipherText, int numColumns)
    {
        StringBuilder decryptCiphertext = new StringBuilder();
        int numRows;

        encryptRowColumn(cipherText, numColumns);

        numRows = cipherText.length() / numColumns;

        for(int row=0; row<=numRows-1; row++)
        {
            int index = row;

            for(int col=0; col<=numColumns-1; col++)
            {
                decryptCiphertext.append(cipherText.charAt(index));
                index += numRows;
            }
        }

        return decryptCiphertext.toString();
    }
}
