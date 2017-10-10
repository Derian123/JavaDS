/**
 * Created by derianescobar on 10/10/17.
 */
public class SpaceReplacement {

    /**
     *
     * @param s
     * @return
     *
     * This method will take in a string and replace all instances of spaces with %20
     * In reality you can use anything you would like to replace.
     */
    public static String replace(String s){

        //Using the replaceAll function I replaced all spaces with %20
        String replacement = s.replaceAll(" ", "%20");

        //returns the new string.
        return replacement;


    }


    public static void main(String[] args) {

        /**
         * A few test cases to see if the code works
         */
        System.out.println(replace("Hi how are you"));
        System.out.println(replace("Hello my name is Java"));
        System.out.println(replace("Today is a nice day"));

    }
}
