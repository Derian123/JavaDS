import java.util.Arrays;

/**
 * Created by derianescobar on 11/5/17.
 */
public class HashTableExample {

    String[] arr;
    int arrSize;
    int itemsInArr = 0;

    public static void main(String[] args) {

        HashTableExample HTE = new HashTableExample(30);

//        String[] elementsToAdd = {"1","5","6","10"};
//
//        HTE.hashFunction1(elementsToAdd, HTE.arr);

        String[] elementsToAdd2 = {"21","13","1", "2", "32", "6", "0"};



        HTE.hashFunction2(elementsToAdd2,HTE.arr);

        HTE.findKey("2");


        System.out.println(HTE.toString());



    }

    public void hashFunction1(String[] stringsForArr, String[] arr){

        for(int i = 0; i < stringsForArr.length; i++){

            String newValue = stringsForArr[i];

            arr[Integer.parseInt(newValue)] = newValue;
        }
    }

    public void hashFunction2(String[] stringsForArr, String[] arr){

        for(int i = 0; i < stringsForArr.length; i++){

            String newValue = stringsForArr[i];

            int arrayIndex = Integer.parseInt(newValue) % 29;

            System.out.println("Mod Index= " + arrayIndex + " For Value " + newValue);

            while(arr[arrayIndex] != "-1"){

                arrayIndex++;

                System.out.println("Collision Occurred");

                arrayIndex %= arrSize;


            }

            arr[arrayIndex] = newValue;

        }

    }

    public String findKey(String key){


        int arrayIndexHash = Integer.parseInt(key) % 29;

        while(arr[arrayIndexHash]!= "-1"){

            if(arr[arrayIndexHash] == key){

                System.out.println(key + "Found In Index" + arrayIndexHash);

                return arr[arrayIndexHash];
            }

            arrayIndexHash++;

            arrayIndexHash %= arrSize;
        }

        return null;



    }

    public HashTableExample(int size){

        arrSize = size;
        arr = new String[size];
        Arrays.fill(arr, "-1");
    }

}
