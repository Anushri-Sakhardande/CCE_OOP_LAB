package LAB_9;

import java.util.Scanner;

public class menu_main2 {

    public int compare(String st1,String st2)
    {
        return st1.compareTo(st2);
    }

    public String caseConvert(String st)
    {
        String converted="";
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            if(Character.isUpperCase(ch)){
                converted+=Character.toLowerCase(ch);
            }
            else{
                converted+=Character.toUpperCase(ch);
            }
        }
        return converted;
    }

    public boolean substring(String st,String sub)
    {
        return st.contains(sub);
    }

    public StringBuffer hello(String st,String sub)
    {
        int index = st.indexOf(sub);
        StringBuffer sb = new StringBuffer(st);
        sb.replace(index,index+sub.length(),"Hello");
        return sb;
    }

    public static void main(String[] args) {
        menu_main2 obj = new menu_main2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:\na. To compare two strings\nb. To convert the uppercase character to lower and vice-versa\nc. To display whether an entered string is a substring of the other or not\nd. If the entered string is a substring of the other, replace it with Hello");
        char choice = sc.nextLine().charAt(0);
        System.out.println("Enter string");
        String str1 = sc.nextLine();
        String str2;
        switch(choice)
        {
            case 'a':
                System.out.println("Enter string to be checked");
                str2 = sc.nextLine();
                System.out.println("Comparison:"+obj.compare(str1,str2));
                break;
            case 'b':
                System.out.println("String in converted case:"+obj.caseConvert(str1));
                break;
            case 'c':
                System.out.println("Enter string to be checked");
                str2 = sc.nextLine();
                System.out.println("Is it a substring:"+obj.substring(str1,str2));
                break;
            case 'd':
                System.out.println("Enter string to be checked");
                str2 = sc.nextLine();
                System.out.println("Substituting hello string is:"+obj.hello(str1,str2));
                break;
        }
    }
}
