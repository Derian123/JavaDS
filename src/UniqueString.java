/**
 * Created by derianescobar on 10/9/17.
 */
public class UniqueString {

    public static boolean isUnique(String s){

        //Change to char array
        char[] chars = s.toCharArray();

        //This will increment when for loops finishes
        int index = 0;
        //Keeps going until the end of the list
        while(index < chars.length-1){
            //Compares everything from index to the end
            for(int i = index+1; i < chars.length; i++){

                if(chars[index] == chars[i]){
                    return false;
                }
            }
            //After the for loop it increment index by 1 to go to the next element to compare everythign
            index++;
        }
        return true;
    }

    public static void main(String[] args) {
        /**
         * Test cases that show this code works
         */
        System.out.println(isUnique("vcxzvz"));
        System.out.println(isUnique("2142app"));
        System.out.println(isUnique("3178nx?><,."));
    }

}
