import java.util.Scanner;
public class hw2 {
    //Number-base converter supporting binary, decimal, octal, and hexadecimal
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = input.nextLine();

        System.out.print("Enter current base: ");
        int currentBase = input.nextInt();
        
        System.out.print("Enter new base: ");
        int newBase = input.nextInt();

        if(!validBase(currentBase) || !validBase(newBase)){
            System.out.println("Invalid base");
            return;
        }

        try{
            int decimalValue = Integer.parseInt(number, currentBase);
            String newValue = Integer.toString(decimalValue, newBase);
            System.out.println("Converted number: " + newValue);
        } catch (NumberFormatException e){
            System.out.println("Invalid number for the given base");
        }
    }
    public static boolean validBase(int base){
        return base == 2 || base ==8 || base == 10 || base == 16;
    }
}
    

