/**
 * Created by derianescobar on 11/1/17.
 *
 * Implementing a Queue using 2 stacks
 * This is only for integers
 */
import java.util.Stack;

public class Queue {

    //Stacks that will be used using the built in stack class
    Stack s1 = new Stack<Integer>();//LIFO
    Stack s2 = new Stack<Integer>();//FIFO

    //Checks to see if both are empty
    public boolean isEmpty(){

        return s1.isEmpty() && s2.isEmpty();
    }

    //Returns the sizes of the stacks
    public int size(){

        return s1.size() + s2.size();
    }

    //Pushes in the element onto the first stack(LIFO)
    public void enqueue(int n){

        s1.push(n);

    }

    //This is essentially the switch
    public int dequeue(){

        //if the second stack is empty
        if(s2.isEmpty()){

            //And while s1 is not empty s2 pushes the element that s1 pops
            while(!s1.isEmpty()){

                s2.push(s1.pop());
            }
        }
        //returns the top element of the new stack(FIFO)
        return (int) s2.pop();
    }

    public int front(){

        //returns the top of the new stack(LIFO)
        return (int) s2.peek();
    }


    public static void main(String[] args) {

        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        System.out.println(q.front());




    }
}
