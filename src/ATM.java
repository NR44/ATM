import java.util.Scanner;
/**
 * Created by Nigel on 6/15/16.
 */
public class ATM {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        Account account = new Account();

        String name = account.enterName();

        if (name.equalsIgnoreCase("")) {
            throw new Exception("I know you have name. Since, you don't wanna tell me, I can't help you.");
        }
        else {
            System.out.println("Hello " + name + ", what would you like to do? Please enter one of the following: 'Check Balance' , 'Withdraw Funds' or 'Cancel'> ");
            String choice = input.nextLine();

            if (!(choice.equalsIgnoreCase("Check Balance") || choice.equalsIgnoreCase("Cancel") || choice.startsWith("withdraw"))){ /** startsWith works here **/
                throw new Exception("You have entered an invalid choice.");
            }
            else if (choice.equalsIgnoreCase("check balance")) {
                account.getBalance();
            }
            else if (choice.startsWith("withdraw")) {  /** startsWith works here too. **/
                account.doWithdraw();
            }
            if (choice.equalsIgnoreCase("cancel")) {
                System.out.println("Thank you and please come again!");
            }
        }
    }
}


