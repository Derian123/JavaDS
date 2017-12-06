/**
 * Created by derianescobar on 10/11/17.
 */

public class Stack {

    int size;
    int top;
    int[] a; //String array (Can be any type)

    //To construct the stack
    public Stack(int n) {
        size = n; // The size
        a = new int[size]; // Initialize the array from class scope
        top = -1; // Variable to help push/pop

    }

    //Get the minimum value of the stack
    public int getMin() {


        int min = 0;

        //Checks to see if the min is empty
        if (isempty()) {

            return -1;
        }

        //if the stack only has 1 element then return that
        if(top == 0){

            return a[top];
        }

        //if the stack only has 2 elements then compare them
        if(top == 1){

            if(a[top-1] < a[top]){

                return a[top-1];
            }
           return a[top];
        }

        //This is for the stack having more than 2 elements.
        //Goes through the array
        for (int i = 0; i < top - 1; i++) {
            int value = a[i];
            min = a[i + 1];

            //Compares the values at the ith positions
            if (value < min) {
                int temp = value;
                value = min;
                min = temp;

            }
        }
        //returns the min
        return min;
    }

    public boolean isempty() {

        return top == -1;

    }

    public void push(int s) {

        if (top < size) { // Make sure that it's not bigger than the stack
            top++;
            a[top] = s; // The starting
            //Then increment to go to the next top
        } else {
            resize();

        }
    }

    public int pop() {
        if (!isempty()) { // Make sure that the stack is not empty
            int temp = top(); // temp is equal to top
            a[top] = -1; // Set current variable to -1
            top--; // Decrement pointer
            return temp; // Return temp
        } else {
            return -1;
        }
    }

    public int top() {
        if (top > -1) { // Make sure the stack isn't empty
            return a[top]; // Return the top element
        } else {
            return -1; // Else return null
        }
    }

    public int[] resize(){

        //if not ready to resize then return the array
        if(size != a.length){

            return a;
        }

        //if it is
        else{

            //create a new array of size * 2 for efficiency
            int[] b = new int[size * 2];

            for(int i = 0; i < a.length; i++){

                //copying the array over
                b[i] = a[i];
            }

            //Changes the size variable
            size = a.length * 2;

            a = b;

            //returns the array
            return a;
        }
    }

}
