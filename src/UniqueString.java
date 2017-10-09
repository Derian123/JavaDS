/**
 * Created by derianescobar on 10/9/17.
 */
public class UniqueString {

    /**
     *
     * @param s
     * @return
     */
    public static boolean isUnique(String s){

        int index = 0; //This is going to increment by 1
        char[] chars = s.toCharArray(); //changing the string into a char array

        while(index < chars.length-1) { //will go until the second to last element in the array
            for (int i = index + 1; i < chars.length; i++) { //i takes the value index inorder to always be one index ahead

                if(chars[index] == chars[i]){ // Checks to see if the chars are equal

                    return false;
                }

            }
            index++;
        }

        return true;

    }

    public static void main(String[] args) {

        /**
         * Some simple test cases where the first two are tree
         *
         * The test cases are done at random where same characters are in different locations
         * to see if the code will detect it
         *
         * The last two test cases are false
         */
        System.out.println(isUnique("4ra4"));
        System.out.println(isUnique("racecar"));

        System.out.println(isUnique("tranquil"));
        System.out.println(isUnique("qwertyuiop432asdf<>"));
    }

}
