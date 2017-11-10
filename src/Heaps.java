import java.util.Arrays;

/**
 * Created by derianescobar on 11/7/17.
 *
 * heap implementation
 *
 *
 */
public class Heaps {

    int capacity = 10;
    int size = 0;

    int[] items = new int[capacity];

    public int getLeftChildIndex(int parentIndex){

        return 2 * parentIndex + 1;
    }

    public int getRightChildIndex(int parentIndex){

        return 2 * parentIndex + 2;

    }

    public int getParentIndex(int childIndex){

        return (childIndex -1) / 2;

    }

    public boolean hasLeftChild(int index){

        return getLeftChildIndex(index) < size;
    }

    public boolean hasRightChild(int index){

        return getRightChildIndex(index) < size;
    }

    public boolean hasParent(int index){

        return  getParentIndex(index) >= 0;
    }

    public int leftChild(int index){

        return items[getLeftChildIndex(index)];
    }

    public int rightChild(int index){

        return items[getRightChildIndex(index)];
    }

    public int parent(int index){

        return items[getParentIndex(index)];
    }

    public void swap(int indexOne, int indexTwo){

        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    public void extraCapacity(){

        if(size == capacity){

            items = Arrays.copyOf(items, capacity * 2);

            capacity *= 2;
        }
    }

    public int peek(){

        if(size == 0 ){

            throw new IllegalStateException();
        }
        return items[0];
    }

    public int poll(){

        if(size == 0 ){

            throw new IllegalStateException();
        }

        int item = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    public void add(int item){

        extraCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    public void heapifyDown() {

        int index = items[0];

        while(hasLeftChild(index)){

            int smallerChildIndex = getLeftChildIndex(index);
            if(hasRightChild(index) && rightChild(index) < leftChild(index)){

                smallerChildIndex = getRightChildIndex(index);
            }

            if(items[index] < items[smallerChildIndex]){
                break;
            }

            else{

                swap(index, smallerChildIndex);
            }

            index = smallerChildIndex;

        }


    }

    public void heapifyUp(){

        int index = size - 1;

        while(hasParent(index) && parent(index) > items[index] ){

            swap(getParentIndex(index), index);
            index = getParentIndex(index);

        }


    }


}
