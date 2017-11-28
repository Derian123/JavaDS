import java.util.Scanner;

/**
 * Created by derianescobar on 11/28/17.
 *
 * This program prints the fibonnacci sequence up to what the user inputs
 * Also it prints out the sum of the entire sequence.
 */
public class Fibonnacci {

    private static int fibonnaciCalculator(int n){



       if(n <= 2){

           return 1;
       }
        else{

           //Tail recursion
            return fibonnaciCalculator(n-1) + fibonnaciCalculator(n-2);
        }

    }

    public static void main(String[] args) {


        System.out.println("Please enter number for Fibonnacci number sequence: ");

        Scanner scan = new Scanner(System.in);

        //num takes in the next integer produced
        int num = scan.nextInt();

        //sum variable

        int sum = 0;
        // to print out every sequence starting at 1 since the number do not start at 0.
        for(int i = 1; i <= num; i++){

            //The variable temp holds in the two previous numbers added together
            int temp = fibonnaciCalculator(i);
            System.out.print(fibonnaciCalculator(i) + " ");

            //add the temp to the sum
            sum += temp;
        }

        System.out.println("\nThe Total sum of the numbers is: " + sum);

    }
}
