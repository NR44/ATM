import java.util.Scanner;

/**
 * Created by Nigel on 6/15/16.
 */
public class Account {

    private Scanner input = new Scanner(System.in);
    private int balance = 100;

    public String enterName(){
        System.out.println("Welcome to Nigel's super awesome ATM. Please enter your name:  ");
        String name = input.nextLine();
        return name;
    }

    public void doWithdraw() throws Exception{

        System.out.println("How much would you like to withdraw? All numbers please, no special characters. > ");
        int withdraw = input.nextInt();

        if (withdraw > balance){
            throw new Exception("You tried to withdraw"+ withdraw +". You may not withdraw more than you have. Good bye.");
        }
        else{
            balance -= withdraw;
            System.out.println("Your new balance is: $"+ balance);
        }
    }
    public void getBalance(){
        System.out.println("Your balance is "+ balance);
    }
}
