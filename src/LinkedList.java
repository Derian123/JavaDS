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


    //Checks to see if the linkedList is empty
    public boolean isEmpty(){

        return head == null;
    }
}
