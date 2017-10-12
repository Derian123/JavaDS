/**
 * Created by derianescobar on 10/11/17.
 *
 * LinkedList class that utilizes a node class in a separate file
 *
 */
public class LinkedList {

    Node head;

    public void append(int data){

        //Checks to see if the linked list is empty
        if(isEmpty()){

            //If it is then head will point to the new node
            head = new Node(data);
            return;
        }

        //Using current to go through the linked list inorder to preserve it
        Node current = head;

        //To get to the end of the list
        while(current.next != null){

            current = current.next;
        }

        //When it reaches the end then the current node will point to the new node that is being added.
        current.next = new Node(data);


    }

    //This method inserts before the head
    public void appendBefore(int data){


        if(isEmpty()){

            head = new Node(data);
            return;
        }
        //Makes a newhead with the data
        //Sets the newhead pointer to the head
        //Makes head point to the new head
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;

    }

    public void delete(int data){

        //Checks to see if the linkedlist is empty
        if(isEmpty()){

            return;
        }

        //Special case where the head is the data to delete
        //If it is then the head goes to the next available node
        if(head.data == data){

            head = head.next;

        }


        Node current = head;
        //Goes until current.next does not equal null
        while(current.next != null){

            //If the next node contrains the data then
            //Skip the next node entirely thus deleting it
            //Since there is no reference to it
            if(current.next.data == data){

                current.next = current.next.next;
            }
            //else move down the list
            current = current.next;

        }

    }

    //This method returns the length of the linkedList
    public int getLength(){

        //Count increments as it iterates through
        int count = 0;

        //Takes into account if the LinkedList is empty
        if(isEmpty()){

            return count;
        }

        //Current will go through the list
        Node current = head;

        //Goes until the current node is null
        while(current != null){

            //Increments then points to the next node
            count++;
            current = current.next;


        }

        return count;
    }

    //Prints out everything in the linked list
    public String toString(){

        //returns it in a string
        String newStr = "Contains:\n";

        Node current = head;

        while(current != null){

            //Then grabs the data
            newStr += current.data + "\n";
            //Goes to the next node
            current = current.next;



        }

        return newStr;
    }


    //Checks to see if the linkedList is empty
    public boolean isEmpty(){

        return head == null;
    }

    //This method find the nth to last element on the linkedlist n has to be greather than n
    public int nthToLast(int n){



        //To get the index we subtract the length from the input
        int index = getLength() - n;

        //Checks to see if the list is empty
        if(isEmpty()){

            return -1;
        }
        //Case where n is less than 0
        if(n < 0){

            return -1;
        }

        //Sets current equal to the head
        Node current = head;

        //For loop that keep going until i reaches the index
        for(int i = 0; i < index; i++){

            //This will keep iterating until the for loop eneds
            current = current.next;
        }

        //Returns the nth element on the link
        return current.data;

    }

    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        l1.appendBefore(4);
        l1.append(3);
        l1.append(43);
        l1.appendBefore(1);
        l1.delete(3);
        l1.delete(1);
        l1.append(32);

        System.out.println(l1.toString());
    }

}
