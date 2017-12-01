/**
 * Created by derianescobar on 12/1/17.
 *
 *MFinds all combinations of a string without using recursion
 */
public class StringCombinations {


    public static void permutations(char[] c){
        //length of array
        int length = c.length;

        //Used to swap to a different character
        int i = 0;

        //Points to second position
        int j = 1;

        //Goes for the entire amount of permutations
        for(int x = 0; x < factorial(c); x++){


            //used for the amount of iteration of each character
            int k = 0;


            //the number of iteration for each character is length! / length
            while(k != factorial(c)/length){


                //Swap with j until the end
                while(j != length-1){

                    //prints out the current permutation
                    System.out.println(stringMaker(c));

                    //Swaps
                    char temp = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp;


                    //increment k
                    k++;


                    //increment j
                    j++;
                    }

                //resets j back to 1
                j=1;

                }

            //increments i
            i++;


            //if i is equal to the length then break. hence the end of the permutations
            if(i == length){

                break;
            }

            //swaps the first position with the next available position
            char temp = c[0];
            c[0] = c[i];
            c[i] = temp;

            }


        }



    //Find the factorial of a number
    public static int factorial(char[] c) {

        //Starts at 1 so the result won't stay at a constant 0
        int factorial = 1;

        //Since i will increment by one hence factorial will be factorial x i
        for (int i = 1; i <= c.length; i++) {

            factorial *= i;

        }


        return factorial;


    }


    //This method is used to make the chars into a string
    public static String stringMaker(char[] c){


        String comb = String.valueOf(c);

        return comb;

    }

    public static void main(String[] args) {

        char[] c = {'c','b','a'};

        permutations(c);


    }

}
