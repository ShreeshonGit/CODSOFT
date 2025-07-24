import java.util.*;
public class ATM_INTERFACE {
double balance;
public ATM_INTERFACE(double initial_bal)
{
    this.balance=initial_bal;
}
double getbal()
{
    return balance;

}
public void deposit(double amount)
{
    if (amount>0){
    balance=balance+amount;
    System.out.println("Transaction Successfull!!");
    System.out.println("INR "+amount+" has been successfully deposited in your account.");

}
else{
System.out.println("Transaction Failed!!");
System.out.println("Enter valid amount to deposit");
}}
public void withdraw(double amount)
{
    if(amount>0 && amount<=balance)
    {
         System.out.println("Transaction Successfull!!");
        System.out.println("INR "+amount+" has been successfully withdrawn.");
        balance=balance-amount;
    }
    else if(amount>balance)
    {
        System.out.println("Transaction Failed!!");
        System.out.println("Insufficient Balance.");

    }
    else{
    System.out.println("Transaction Failed!!");
    System.out.println("Enter a valid amount to withdraw.");
    }
}}
class ATM extends ATM_INTERFACE
{
    public ATM(double initial_bal)
    {
        super(initial_bal);
    }
    public void atminterface()
    {
        System.out.println("----WELCOME TO THE ATM----");
        while (true)
        {
        System.out.println("\nATM MENU");
        System.out.println("1. CHECK BALANCE");
        System.out.println("2. DEPOSIT MONEY");
        System.out.println("3. WITHDRAW MONEY");
        System.out.println("4. EXIT");
        Scanner sn=new Scanner(System.in);
        System.out.println("Choose an option: ");
        int choice=sn.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Current Balance INR "+getbal());
            break;
            case 2:
            System.out.println("Enter amount to be deposited: ");
            double deposit_amount=sn.nextDouble();
            deposit(deposit_amount);
            break;
            case 3:
            System.out.println("Enter amount to be withdrawn: ");
            double withdraw_amount=sn.nextDouble();
            withdraw(withdraw_amount);
            break;
            case 4:
            System.out.println("Thank you for using this ATM!");
            return;
            default:
            System.out.println("INVALID CHOICE!! PLEASE TRY AGAIN");

        }

        }
    }
        public static void main(String[] args) {
            ATM ob= new ATM(1000.0);
            ob.atminterface();

        }

}

    
