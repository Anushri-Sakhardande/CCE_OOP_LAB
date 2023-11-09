package LAB_10;

import java.util.Scanner;

class NotAnushriException extends Exception{
    NotAnushriException(String message){
        super(message);
    }
}

public class UserExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        try{
            String name = sc.nextLine();
            if(!name.toLowerCase().equals("anushri")){
                throw new NotAnushriException("You are not cool enough");
            }
            System.out.println("Congratulations! You are cool enough");
        }catch(NotAnushriException e){
            System.out.println("Aww that's sad "+e.getMessage());
        }
    }
}
