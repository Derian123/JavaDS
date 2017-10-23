/**
 * Created by derianescobar on 10/20/17.
 *
 *
 * This is the solution for the valid parenthesis problem.
 */
import java.util.Stack;
public class ValidParenthesis {

    public static boolean isValid(String s){

        //Turns the string into a char array
        char[] c = s.toCharArray();

        //Stack
        Stack stack = new Stack();

        //Goes through each element in the char array
        for(int i = 0; i < c.length; i++){

            //Checks to see if the current element is an opening
            if(c[i] == '[' || c[i] == '{' || c[i] == '('){
                //Pushes the char onto the stack
                stack.push(c[i]);
            }

            //Checks to see if the current element is a closing
            if(c[i] == ']' || c[i] == '}' || c[i] == ')'){
                //If the stack is empty then the opening is not on the stack there fore it is false.
                if(stack.isEmpty()){
                    return false;
                }
                //sets temp to be the opening at the top of the stack
                char temp = (char)stack.pop();

                //If the opening does not match the closing then we will return false
                if((temp == '{' && c[i] != '}') || (temp == '[' && c[i] != ']') || (temp == '(' && c[i] != ')')){

                    return false;
                }
            }
        }
        //In the end if the stack is empty then everything found its match
        if(stack.isEmpty()) {

            return true;
        }
        //If there is still an element on the stack then we return false
        else{

            return false;
        }
    }

    public static void main(String[] args) {

        //Test strings
        String s = "{})([]";

        System.out.println(isValid(s));
    }
}
