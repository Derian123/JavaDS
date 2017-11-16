import java.util.Random;

/**
 * Created by derianescobar on 11/13/17.
 *
 *
 * This class will contain all the sorting algorithms
 *
 */
public class SortingExamples {

    int arraySize;
    static int[]arr;

    //Constructor
    public SortingExamples(int arraySize){


        this.arraySize = arraySize;

        arr = new int[arraySize];
    }



    //Merge sort implementation
    public int[] mergeSort(int[] arr){

        //If the array's size is greater than 1
        if(arr.length > 1){

            //Devides by 2 to get the half of the size hence the first size of the element
            int elementsInFirstHalf = arr.length/2;

            //This is initially goin gto get the second half.
            int elementsInSecondHalf = elementsInFirstHalf;

            //Array for the first half of the elements
            int[] arrofFirstHalf = new int[elementsInFirstHalf];

            //Array for the second half of the elements
            int[]arrofInSecondHalf = new int[elementsInSecondHalf];

            //For loop that'll go through the first half of the array
            for(int i = 0; i < elementsInFirstHalf; i++){


                arrofFirstHalf[i] = arr[i];
            }

            //Second loop that'll go through the second half of the array.
            for(int i = elementsInFirstHalf; i < elementsInFirstHalf + elementsInSecondHalf; i++){


                arrofInSecondHalf[i - elementsInFirstHalf] = arr[i];

            }

            //recursively calls merge sort for both arrays because the size is still greater than 1.
            arrofFirstHalf = mergeSort(arrofFirstHalf);

            arrofInSecondHalf = mergeSort(arrofInSecondHalf);

            //i stores the main array
            //j stores the first half
            //k stores the second half
            int i = 0;
            int j = 0;
            int k = 0;


            //Keeps on running until one becomes empty
            while(arrofFirstHalf.length != j && arrofInSecondHalf.length != k){

                //Once the element is added if it is then we increment i and j
                if(arrofFirstHalf[i] < arrofInSecondHalf[k]){

                    arr[i] = arrofFirstHalf[i];
                    i++;
                    j++;

                }

                //if not then we increment i and k and then open the second value
                else{

                    arr[i] = arrofInSecondHalf[k];
                    i++;
                    k++;
                }
            }


            while(arrofFirstHalf.length != j ){

                arr[i] = arrofFirstHalf[j];
                i++;
                j++;

            }

            while (arrofInSecondHalf.length != k ){

                arr[i] = arrofInSecondHalf[k];
                i++;
                k++;
            }


        }
        //returns the sorted array
        return arr;
    }


    //bubble sort
    public void bubbleSort(){

        //nested for loops that goes once with i and then again with j
        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr.length; j++){

                //sees if arr[i] is less than arr[j]
                if(arr[i] < arr[j]){

                    //SWAP if it is
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
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
     * method
     */
    public static void main(String[] args) {

        SortingExamples sse = new SortingExamples(10);

        sse.generateRandomNums();

        sse.bubbleSort();

        sse.mergeSort(arr);


        for(int i = 0; i < sse.arraySize; i++) {

            System.out.println(sse.arr[i]);
        }


    }



}
