import java.util.Scanner;

class Account {
    String name;
    int acc_no;
    String acc_type;
    int balance;
    int minimumBalance;

    Account(String name ,int acc_no,String acc_type,int balance,int minimumBalance)
    {
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    void acceptUpdate(int deposit)
    {
        System.out.println("Deposit accepted");
        balance += deposit;
        displayBalance();
    }

    void displayBalance()
    {
        System.out.println("Balance for account no "+acc_no+" is:"+balance);
    }

    void computeInterest(float rate)
    {
        float interest = (rate/100)*balance;
        System.out.println("Interest is:"+interest);
    }

    void withdrawUpdate(int withdraw)
    {
        System.out.println("Withdrawal permitted");
        balance-=withdraw;
        displayBalance();
    }

    void minimumBalance(int withdraw)
    {
        if(balance <= minimumBalance)
        {
            System.out.println("Minimum balance reached");
            System.out.println("Penalty to be extracted of Rs.100");
            balance-=100;
            displayBalance();
        }
        else if((balance - withdraw) < minimumBalance)
        {
            System.out.println("Withdrawal not permitted");
        }
        else
        {
            withdrawUpdate(withdraw);
        }

    }
}

class currentAccount extends Account{
    currentAccount(String name ,int acc_no,String acc_type,int balance,int minimumBalance)
    {
        super(name,acc_no,acc_type,balance,minimumBalance);
    }

    void currentExecute()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to withdraw and 2 to deposit");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter amount to be withdrawn");
                int withdraw = sc.nextInt();
                minimumBalance(withdraw);
                break;
            case 2:
                System.out.println("Enter amount to be deposited");
                int deposit = sc.nextInt();
                acceptUpdate(deposit);
                break;
        }
    }
}

class savingAccount extends Account{
    savingAccount(String name ,int acc_no,String acc_type,int balance,int minimumBalance)
    {
        super(name,acc_no,acc_type,balance,minimumBalance);
    }

    void savingExecute()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to compute interest and 2 to withdraw and 3 to deposit");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter rate");
                int rate = sc.nextInt();
                computeInterest(rate);
                break;
            case 2:
                System.out.println("Enter amount to be withdrawn");
                int withdraw = sc.nextInt();
                minimumBalance(withdraw);
                break;
            case 3:
                System.out.println("Enter amount to be deposited");
                int deposit = sc.nextInt();
                acceptUpdate(deposit);
                break;
        }
    }
}

public class accountMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter the account number");
        int acc_no = Integer.parseInt(sc.nextLine());
        System.out.println("Enter account type");
        String acc_type = sc.nextLine();
        System.out.println("Enter current balance");
        int balance = Integer.parseInt(sc.nextLine());
        if(acc_type.toLowerCase().equals("current"))
        {
            System.out.println("Enter minimum balance");
            int minimumBalance = Integer.parseInt(sc.nextLine());
            currentAccount obj =new currentAccount(name,acc_no,acc_type,balance,minimumBalance);
            obj.currentExecute();
        }
        else if(acc_type.toLowerCase().equals("savings"))
        {
            savingAccount obj =new savingAccount(name,acc_no,acc_type,balance,0);
            obj.savingExecute();
        }
    }
}