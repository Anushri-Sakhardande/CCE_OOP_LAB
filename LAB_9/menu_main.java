package LAB_9;

import java.util.Arrays;
import java.util.Scanner;

public class menu_main {
    public boolean palindrome(String sent)
    {
        String sb = reverse(sent);
        boolean ret = sent.equals(sb);
        return ret;
    }

    public String sort(String sent)
    {
        char arr[] = sent.toCharArray();
        Arrays.sort(arr);
        String ret = new String(arr);
        return ret;
    }

    public String reverse(String sent)
    {
        StringBuffer sb = new StringBuffer(sent);
        sb.reverse();
        String ret = new String(sb);
        return ret;
    }

    public String concatenate(String sent)
    {
        String rev = reverse(sent);
        String ret = sent.concat(rev);
        return ret;
    }

    public static void main(String[] args) {
        menu_main obj = new menu_main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:\na. To check whether a string is palindrome or not\nb. Write the string in an alphabetical order\nc. Reverse the string\nd. Concatenate the original string and the reversed string");
        char choice = sc.nextLine().charAt(0);
        System.out.println("Enter string to be checked");
        String str1 = sc.nextLine();
        switch(choice)
        {
            case 'a':
                System.out.println("Is it a palindrome:"+obj.palindrome(str1));
                break;
            case 'b':
                System.out.println("String in alphabetical order:"+obj.sort(str1));
                break;
            case 'c':
                System.out.println("Reversed string:"+obj.reverse(str1));
                break;
            case 'd':
                System.out.println("Concatenated string is:"+obj.concatenate(str1));
                break;
        }
    }
}
