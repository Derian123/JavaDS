/**
 * Created by derianescobar on 10/9/17.
 */
public class Anagram {


    /**
     *
     * @param chars
     * @return
     *
     * used bubble sort because this is for small string
     * if the strings got longer use a better more efficent search
     *
     */
    public static char[] bubbleSort(char[] chars){

        //Assuming every item on the list is unordered it'll go for each item
        for(int i = 0 ; i < chars.length; i++){
            //compares the current index to the next
            for(int j = 0; j < chars.length-1; j++){
                //casting to int inorder to compare their numerical values
                if((int)chars[j] > chars[j+1]){

                    /**
                     * Next 3 lines of code is for swapping
                     */
                    char temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp;
                }
            }

        }
        return chars;
    }



    /**
     *
     * @param s1
     * @param s2
     * @return
     */
    public static boolean isAnagram(String s1, String s2){

        //Changes the strings into char arrays
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        //By default if they're not the same length then they can't be equal
        if(s1.length() != s2.length()){

            return false;
        }
        //Calls bubblesort inorder to sort the char arrays
        bubbleSort(c1);
        bubbleSort(c2);

        //goes the the list to see if they're not equal
        for(int i = 0; i < c1.length; i++){

            if(c1[i] != c2[i]){

                return false;
            }
        }

        return true;


    }

    public static void main(String[] args) {
        /**
         * Few test cases that show the code works
         */
        System.out.println(isAnagram("rats", "star"));
        System.out.println(isAnagram("uiopkla" , "pkuiola"));
        System.out.println(isAnagram("<><><><><>" , "<><><<<><"));
        System.out.println(isAnagram("123977<!@$" , "!@79<13$72"));
    }

}
