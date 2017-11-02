/**
 * Created by derianescobar on 11/1/17.
 */
public class StringPermutations {

    public boolean permuation(String s1, String s2){

        //Replaces all spaces within a string to ""
        String newS1 = s1.replaceAll("\\s", "");
        String newS2 = s2.replaceAll("\\s", "");

        //creates char arrays on new strings
        char[] c1 = newS1.toCharArray();
        char[] c2 = newS2.toCharArray();

        //Loops for each char in the first char array
        for (int i = 0; i < c1.length; i++) {

            //Loops for each char in the second char array
            for (int j = 0; j < c2.length; j++) {

                //If both chars are the same then make the entry to c1 equal ' '
                if (c1[i] == c2[j]) {

                    c1[i] = ' ';
                }
            }
        }
        //This will loop through the c1 array again to check if every entry is ' '
        //This will show if every letter appeared in the second string
        for(int i = 0; i < c1.length; i++){

            //If it doesn't then we return false
            if(c1[i] != ' '){

                return false;
            }

        }
        //Return true if every entry is ' '
        return true;
    }


    public static void main(String[] args) {

        //This string should be the permutation
        String s1 = "tsl";

        //This should just be a regular string
        String s2 = "a c t s l w a q";

        StringPermutations permutation = new StringPermutations();

        System.out.println(permutation.permuation(s1,s2));



    }


}
