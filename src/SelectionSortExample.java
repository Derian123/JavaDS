import java.util.Random;

/**
 * Created by derianescobar on 11/13/17.
 */
public class SelectionSortExample {

    int arraySize;
    int[]arr;

    //Constructor
    public SelectionSortExample(int arraySize){


        this.arraySize = arraySize;

        arr = new int[arraySize];
    }

    //Selection sort
    public void selectionSort() {

        //go es thorugh each element
        for (int i = 0; i < arr.length; i++) {

            //Makes i the minimum
            int minimum = i;

            //goes through the array again with a different loop
            for (int j = i; j < arr.length; j++) {

                //Checks to see which is bigger
                if (arr[minimum] > arr[j]) {

                    //Changes the min if it is
                    minimum = j;
                }
            }

            //Swap
            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;
        }

    }


    //Generates random numbers to put into the array
    public void generateRandomNums(){


        Random rand = new Random();

        //Fills each index with an element from 0 - 51
        for(int i = 0; i < arr.length; i++){

            arr[i] = rand.nextInt(50) + 1;
        }

    }

    /**
     *
     * @param args
     *
     * MAIN
     */
    public static void main(String[] args) {

        SelectionSortExample sse = new SelectionSortExample(10);

        sse.generateRandomNums();

        sse.selectionSort();


        for(int i = 0; i < sse.arraySize; i++) {

            System.out.println(sse.arr[i]);
        }


    }



}
