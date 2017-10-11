/**
 * Created by derianescobar on 10/11/17.
 */
public class Stack{

    int size;
    int top;
    String []a; //String array (Can be any type)

    //To consturct the stack
    public Stack(int n){
        size = n; // The size
        a = new String[size]; // Initialize the array from class scope
        top = -1; // Variable to help push/pop

    }

    public boolean empty(){
        if(top == -1){ //If pointer is still -1
            return true;
        }
        else{
            return false;
        }
    }

    public void push(String s){

        if(top < size) { // Make sure that it's not bigger than the stack
            top++;
            a[top] = s; // The starting
            //Then increment to go to the next top
        }
        else{
            System.out.println("Stack Overflow");

        }
    }

    public String pop(){
        if(!empty()){ // Make sure that the stack is not empty
            String temp = top(); // temp is equal to top
            a[top] = null; // Set current variable to null
            top--; // Decrement pointer
            return temp; // Return temp
        }
        else{
            return null;
        }
    }

    public String top(){
        if(top > -1) { // Make sure the stack isn't empty
            return a[top]; // Return the top element
        }
        else{
            return null; // Else return null
        }
    }
}
