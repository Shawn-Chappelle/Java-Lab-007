/**
 *
 * Shawn Chappelle 10/12/2022
 *
 **/
import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.print("Insert an integer: ");
        int input = s.nextInt();
        int output = 0;
        for(int n = 0; n <= input; n++){
            output += n;
        }
        System.out.println("The sum is "+output);
    }

    public static void rangeSum() {
        System.out.print("Insert an integer: ");
        int inputOne = s.nextInt();
        System.out.print("Insert an integer: ");
        int inputTwo =s.nextInt();
        int output = 0;
        for(int n = inputTwo; n <= inputOne; n++){
            output += n;
        }
        System.out.println("The sum of the range is "+output);
    }

    public static void factorial() {
        System.out.print("Insert an integer: ");
        int input = s.nextInt();
        int output = 1;
        for(int n = 1; n <= input; n++){
            output *= n;
        }
        System.out.println("The factorial is "+output);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
