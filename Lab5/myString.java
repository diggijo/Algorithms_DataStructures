package Lab5;

public class myString{
    public static void main(String[] args) {
        String str = "Hello!";

        System.out.println(reverse(str));
    }

    public static String reverse(String str)
    {
        if(str.isEmpty() || str.length()==1)
            return str;
        else
            return reverse(str.substring(1)) + str.charAt(0);
    }
}
