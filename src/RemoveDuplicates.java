/**
 * Created by derianescobar on 10/10/17.
 *
 */
public class RemoveDuplicates {

    public static String removeDups(String s){

        //This variable will contain the new string
        String newString = "";

        //iterate through each character
        for(int i = 0; i < s.length(); i++) {

            //if the new string does not contain the character at index i then append that
            //character onto the new string
            if (!newString.contains(String.valueOf(s.charAt(i)))) {

                //appends unique chracter onto the string
                newString += String.valueOf(s.charAt(i));
            }

        }

        return newString;

    }



    public static void main(String[] args) {

        System.out.println(removeDups("apples"));
        System.out.println(removeDups("yello"));
        System.out.println(removeDups("<reverse<"));
        System.out.println(removeDups("7749137593"));

    }

}
