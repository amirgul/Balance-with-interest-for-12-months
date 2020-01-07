import java.util.Scanner;

public class Main
{
    public static final double INTEREST_RATE = 0.10;  //10%

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("The program will compute 12 months balance with interest");
        System.out.println("please enter your current balance: ");
        double balance = keyboard.nextDouble();
        for(int i = 1; i<= 12; i++)
        {
            balance = balance + (INTEREST_RATE * balance)/12.0;
            System.out.println("you can either do deposit or withdraw");
            System.out.println("for deposit enter positive amount");
            System.out.println("for withdrawn enter negative amount");
            double amount = keyboard.nextDouble();
            if(amount > 0)
                System.out.println("you deposit the amount");
            else
                System.out.println("you withdraw the amount");
            balance = balance + amount;
            System.out.println("you balance for month: " + i +" with interest is: " + balance);




        }


    }
}
