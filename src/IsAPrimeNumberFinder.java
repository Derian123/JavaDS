/**
 * Created by derianescobar on 12/4/17.
 */
public class IsAPrimeNumberFinder {


    //This will keep track of how many numbers are evenly divisble
    int count = 0;


    public boolean isAPrimeNumber(int x){

        //This loops starts at 1 because of % 0 case and goes upto and included to the users input
        for(int i = 1; i <= x;i++){

            //if the mod = 0 then it is a divisor
            if(x % i == 0) {

                //increment count
                count++;

            }
            //if count is greater than 2 we return true because prime numbers
            //Can only be divisble by 1 and itself
            if(count > 2){

                return false;
            }



        }

        //If the entire loop finishes then we return true
        return true;
    }

    public static void main(String[] args) {

        IsAPrimeNumberFinder prime = new IsAPrimeNumberFinder();

        System.out.println(prime.isAPrimeNumber(3));


    }
}
