/**
 * Created by derianescobar on 10/30/17.
 *
 * prints out fizz if divisible by 3
 * buzz if divisible by 5
 * fizzbuzz if divisible by 3 and 5
 * prints out the number if divisible by neither
 *
 */
public class FizzBuzz {

    public static String fizzBuzz(int n){


        String newString = "";

        //i will go up to and including n
        for(int i = 1; i <= n; i++){

            //Checks to see if divisble by 15 hence 3 and 5
            if(i % 15 == 0){


                //appends to the string
                newString += "Fizzbuzz,";
                continue;

            }

            //Checks to see if divisible by 5
            if(i % 5 == 0){

                //appends to the string
                newString += "Buzz,";
                continue;

            }

            //Checks to see if divisible by 3
            if(i % 3 == 0){

                //appends to the string
                newString += "Fizz,";
                continue;
            }

            //If all cases fail then it appends the number
            newString += i + ",";

        }

        //returns the newstring
        return newString;

    }


    public static void main(String[] args) {

        System.out.println(fizzBuzz(100));

    }
}
