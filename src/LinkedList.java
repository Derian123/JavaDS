/**
 * Created by derianescobar on 10/11/17.
 *
 * LinkedList class that utilizes a node class in a separate file
 *
 */
public class LinkedList {

    Node  head;

    public void append(int data){

        //Checks to see if the linked list is empty
        if(isEmpty()){

            //If it is then head will point to the new node
            head = new Node(data);
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

        //Goes until the nest node is null
        while(current.next != null){

            //Points to the next node then increments count
            current = current.next;
            count++;

        }

        return count;
    }

    //Prints out everything in the linked list
    public String toString(){

        //returns it in a string
        String newStr = "Contains:\n";

        Node current = head;

        while(current.next != null){

            //Goes to the next node
            current = current.next;
            //Then grabs the data
            newStr += current.data + "\n";

        }

        return newStr;
    }


    //Checks to see if the linkedList is empty
    public boolean isEmpty(){

        return head == null;
    }

    //This method find the nth to last element on the linkedlist
    public int nthToLast(int n){

        //To get the index we substract the length from the input
        int index = getLength() - n;

        //Checks to see if the list is empty
        if(isEmpty()){

            return -1;
        }

        //Sets current equal to the head
        Node current = head;

        //For loop that keep going until i reaches the index
        for(int i = 0; i <= index; i++){

            //This will keep iterating until the for loop eneds
            current = current.next;
        }

        //Returns the nth element on the link
        return current.data;

    }

    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        l1.append(35);
        l1.append(43);
        l1.append(54);
        l1.append(5);
        l1.append(4);
        l1.append(9);
        l1.append(8);
        System.out.println(l1.nthToLast(3));
    }

}
