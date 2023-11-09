package LAB_9;

import java.util.Scanner;

public class replace_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sent = sc.nextLine();
        System.out.println("Enter a word");
        String word = sc.nextLine();
        int index = sent.indexOf(word);
        String replaceWord="";
        for(int i=0;i<word.length();i++)
        {
            replaceWord+='*';
        }
        StringBuffer sb = new StringBuffer(sent);
        sb.replace(index,index+word.length(),replaceWord);
        System.out.println(sb);
    } 
}
