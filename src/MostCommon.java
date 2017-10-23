/**
 * Created by derianescobar on 10/23/17.
 *
 * This program finds the most common number within two arrays along with the count
 *
 * NOT YET COMPLETE
 */
public class MostCommon {

    public static String secondMostCommon(int[] n1 , int[] n2) {

        //variables.
        int first = 0;
        int second = 0;
        int third = 0;
        int indexOfFirst = 0;
        int indexOfSecond = 0;
        int indexOfThird = 0;


        //double for loop that loops through each separate array.
        for (int i = 0; i < n1.length; i++){
            for(int j = 0; j < n2.length; j++){

                //This will make it so first will only increment the first time around.
                if(i == 0){
                    if(n1[i] == n2[j]){

                        indexOfFirst = n1[i];
                        first++;
                    }

                }
                //This will make it so that second will only increment the second time around.
                if(i == 1){

                    if(n1[i] == n2[j]){
                        indexOfSecond = n1[i];
                        second++;

                    }

                }

                //This will make it so that only third increments
                if(n1[i] == n2[j]){

                    indexOfThird = n1[i];
                    third++;
                }

                //Checks to see if the third most occurrances is larger than the second.
                if(third > second){

                    //switches the indexes around
                    indexOfSecond = indexOfThird;

                    //Second takes the value of third
                    second = third;

                    //Reset the value of third
                    third = 0;

                }

                //reset the value if not bigger
                third = 0;

                //if second if bigger than first.
                if(second > first){

                    //swaps first with second
                    int temp = second;
                    second = first;
                    first = temp;

                    //swaps the indexes
                    int tempIndex = indexOfSecond;
                    indexOfSecond = indexOfFirst;
                    indexOfFirst = tempIndex;
                }

            }
        }
        return "Count:" + second + "number: " + indexOfSecond;
    }


    public static void main(String[] args) {

        int[] n1 = {1,3,4,6,2};
        int[] n2 = {3,4,1,3,2,4,1,4,3,4,3,3};

        System.out.println(secondMostCommon(n1,n2));

    }
}
