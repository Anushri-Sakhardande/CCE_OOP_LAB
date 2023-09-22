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
        int ret=0;
        sent.trim();
        for(int i =0;i<sent.length();i++){
            if(!Character.isLetter(sent.charAt(i))){
                ret++;
            }
        }
        return ret;
    }

    int lines(String sent) {
        int ret=0;
        sent.trim();
        for(int i =0;i<sent.length();i++){
            if(sent.charAt(i) == '.'){
                ret++;
            }
        }
        return ret;
    }

    int vowels(String sent){
        int ret=0;
        sent.toLowerCase();
        for(int i =0;i<sent.length();i++){
            if(sent.charAt(i) == 'a' || sent.charAt(i) == 'e' || sent.charAt(i) == 'i'|| sent.charAt(i) == 'o'|| sent.charAt(i) == 'u'){
                ret++;
            }
        }
        ret++;
        return ret;
    }
}
