package Lab1.Q4;

/* Q.4  Validate a new password as follows:
        It must be at least 8 characters long
        It must have at least one uppercase and one lowercase letter
        It must have at least one digit

        Write a program that asks the user to enter a new password. Ask again until the input conforms to the rules. Use a method with the following header to check if a password is valid:
        public static boolean isValid(String password) */

import javax.swing.*;

public class Q4 {
    public static void main(String[] args) {
        String password;

        do{
            password = JOptionPane.showInputDialog("Please enter a password");
        }while(!isValid(password));

        if(isValid(password))
            JOptionPane.showMessageDialog(null, "Password Set!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean isValid(String password)
    {
        int noUpper = 0, noLower = 0, noDigits = 0;
        if(password.length()>=8)
        {
            for(int i=0; i<password.length(); i++)
            {
                if(Character.isUpperCase(password.charAt(i)))
                    noUpper++;
                if(Character.isLowerCase(password.charAt(i)))
                    noLower++;
                if(noUpper>=1 && noLower>=1)
                {
                        if(Character.isDigit(password.charAt(i)))
                            return true;
                }
            }
        }
        return false;
    }
}
