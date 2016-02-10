import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args){
        final double INTEREST = .00417;
                
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double saving = input.nextDouble();
        
        double value = saving * (1 + INTEREST);
        value = (value + saving) * (1 + INTEREST);
        value = (value + saving) * (1 + INTEREST);
        value = (value + saving) * (1 + INTEREST);
        value = (value + saving) * (1 + INTEREST);
        value = (value + saving) * (1 + INTEREST);
        
        System.out.println("After the sixth month, the account" + 
                " value is " + value);
    } // main
} // CompoundValue
