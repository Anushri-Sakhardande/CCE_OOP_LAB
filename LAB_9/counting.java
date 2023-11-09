package LAB_9;

import java.util.Scanner;

public class counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sent = sc.nextLine();
        counting obj = new counting();
        System.out.println("Number of characters:"+obj.characters(sent));
        System.out.println("Number of words:"+obj.words(sent));
        System.out.println("Number of lines:"+obj.lines(sent));
        System.out.println("Number of vowels:"+obj.vowels(sent));
    }

    int characters(String sent) {
        int ret=0;
        for(int i =0;i<sent.length();i++){
            if(Character.isLetter(sent.charAt(i))){
                ret++;
            }
        }
        return ret;
    }

    int words(String sent) {
        String arr[]=sent.split(" ");
        return arr.length;
    }

    int lines(String sent) {
        String arr[]=sent.split("\\.",0);
        return arr.length;
    }

    int vowels(String sent){
        int ret=0;
        sent = sent.toLowerCase();
        char arr[]= new char[sent.length()];
        sent.getChars(0,sent.length(),arr,0);
        for(int x:arr)
        {
            if(x == 'a' || x == 'e' || x == 'i'|| x == 'o'|| x == 'u'){
                ret++;
            }
        }
        return ret;
    }
}
