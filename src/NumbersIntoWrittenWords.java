/**
 * Created by derianescobar on 10/24/17.
 *
 * This turns any 3 digit numbers into words
 * In theory you can do this for any number so long as you
 * add the arrays for the next digit places.
 *
 * I will change this to be more efficient later
 *
 *
 */
public class NumbersIntoWrittenWords {


    public static String numbersToString(int n, int size) {

        //The size must agree witht the length of the int
        int[] n1 = new int[size];

        //Index to go strip numbers off
        int index = 0;

        //Will hold the first part
        String part1 = "";

        //Will hold the middle part
        String part2 = "";

        //Will hold the third part
        String part3 = "";

        /**
         * Since there is no way for an int to be put into words I made the arrays
         * myself where the index of each array is a different value
         *
         * There is two different arrays for the tens place due to the face that numbers 11-19 take up both
         * the tens place and ones place
         */
        String[] hundreds = {"One Hundred ", "Two Hundred ", "Three Hundred ", "Four Hundred ", "Five Hundred ",
                "Six Hundred ", "Seven Hundred ", "Eight Hundred ", "Nine Hundred "};

        String[] tens = {"Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};

        String[] tenToNineteen = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen ", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen"};

        String[] ones = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};


        //While there is still numbers it'll keep getting the last number by %10
        while(n > 0) {

            n1[index] = n % 10;
            n /= 10;
            index++;

        }

        //Goes through the entire array
        for(int i = 0; i < n1.length; i++){

            //Accounts for the ones place since the numbers are in the array backwards
            if(i == 0){

                //Since the ones place goes first it checks to see if the next index is the number 1
                if(n1[i+1] == 1){

                    //if so go to the next index
                    continue;
                }

                //else get the value from the ones array.
                else{

                    part1 = ones[n1[i]-1];
                }

            }

            //This is for the middle value
            else if(i == 1){

                //If the index is the number 1 then look up from the special case
                if(n1[i] == 1){

                    //It looks up the index based on the previous number
                    part2 = tenToNineteen[n1[i-1]];
                }

                //Else go to the regular tens array.
                else{

                    part2 = tens[n1[i]-2];
                }

            }
            //For the last number it'll just get the number in the index
            else{

                //-1 due to the face that arrays start at 0
                part3 = hundreds[n1[i]-1];
            }

        }
    //returns all the parts concatenated.
    return part3 + part2 + part1;
}
    public static void main(String[] args) {

        //Size must agree with the size of the int
        System.out.println(numbersToString(612,3));
        System.out.println(numbersToString(111,3));
        System.out.println(numbersToString(314,3));
        System.out.println(numbersToString(785,3));
        System.out.println(numbersToString(999,3));


    }
}
