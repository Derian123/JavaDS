/**
 * Created by derianescobar on 10/31/17.
 *
 * This will turn the first letter in every word
 * into uppercase
 */
public class StringToTitleFormat {

    public static String firstLetterOfEveryWordToCapital(String s){


        //Puts the string into a string array split by spaces.
        String[] split = s.split(" ");

        //String buffer to modify the characters in the array
        StringBuilder builder = new StringBuilder();

        //Will go through each word of the array
        for(int i = 0; i < split.length; i++){

            //Takes the word at i and grabs the char at 0 hence the first letter
            //Then turns it to uppercase
            builder.append(Character.toUpperCase(split[i].charAt(0)));

            //Appends the rest of the word onto the string
            builder.append(split[i].substring(1));

            //Put's in the space once the rest of the word has been appended
            builder.append(" ");
        }

        //Returns the buffer into a string
        return builder.toString();


    }

    public static void main(String[] args) {

        //String s variable
        String s = "how should we do this?";

        System.out.println(firstLetterOfEveryWordToCapital(s));
    }

}
