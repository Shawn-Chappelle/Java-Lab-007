/**
 *
 * Shawn Chappelle 10/12/2022
 *
 **/
import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);
    public static int evenNumbers;
    public static int oddNumbers;
    public static void eoCount() {
        int input;
        oddNumbers = 0;
        evenNumbers = 0;
        while((input = s.nextInt()) != 0){
            if(input % 2 == 0){
                evenNumbers++;

            } else if (input % 2!=0) {
                oddNumbers++;
            }

        }
        System.out.println("There are "+evenNumbers+" even numbers");
        System.out.println("There are "+oddNumbers+" odd numbers");
    }

    public static void mean() {
         double arrayLength = evenNumbers+oddNumbers;
         double specialArrayLength = evenNumbers+oddNumbers;
         double arraySum = 0;
         double output;
        while(specialArrayLength > 0){
                arraySum += s.nextInt();
                specialArrayLength -= 1;
        }
        output = arraySum/(arrayLength);
        System.out.println("The mean of the inserted array is "+output);
    }

    public static void main(String[] args) {
        System.out.println("Insert a list of integers ending with 0 to receive the number of even and odd numbers: ");
        eoCount();
        System.out.println("Insert a list of integers ending with 0 to receive the mean of those numbers: ");
        mean();
    }
}
