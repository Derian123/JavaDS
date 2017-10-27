import java.util.ArrayList;

/**
 * Created by derianescobar on 10/27/17.
 */
public class Divisors {


    public static ArrayList<Integer> findDivisors(int n){

        //creates the arrayList
        ArrayList<Integer> nums = new ArrayList<>();

        //i starts at 1 because diving by 0 would cause an error
        //will check every number 1 by 1
        for(int i = 1; i <= n; i++){

            //Checks to see if the remainder is 0 then it is considered a divisor
            if(n % i == 0){
                //Add the number onto the arraylist
                nums.add(i);
            }
        }

        //returns the arraylist
        return nums;

    }

    public static void main(String[] args) {

        System.out.println(findDivisors(9));
    }
}
