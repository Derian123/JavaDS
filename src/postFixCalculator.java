/**
 * Created by derianescobar on 12/7/17.
 */

import java.util.Stack;
public class postFixCalculator {

    public int calculation(String s){

        Stack stack = new Stack<Integer>();

        char[] c = s.toCharArray();

        for(int i = 0; i < c.length; i++){

            if((c[i] != '+') && (c[i] != '-') && (c[i] != '/') && (c[i] != '*') && (c[i] != '^')){

                stack.push(Character.getNumericValue(c[i]));
            }
            else{

                if(c[i] == '+'){

                    int a = (int)stack.pop();
                    int b = (int)stack.pop();

                    int sum = a+ b;
                    stack.push(sum);
                }
                else if(c[i] == '-'){

                    int a = (int)stack.pop();
                    int b = (int)stack.pop();

                    int sum = a - b;
                    stack.push(sum);

                }
                else if(c[i] == '*'){

                    int a = (int)stack.pop();
                    int b = (int)stack.pop();

                    int sum = a * b;
                    stack.push(sum);
                }

                else if(c[i] == '/'){

                    int a = (int)stack.pop();
                    int b = (int)stack.pop();

                    int sum = a / b;
                    stack.push(sum);

                }
                else if(c[i] == '^'){

                    int a = (int) stack.pop();

                    int sum = a * a;

                    stack.push(sum);

                }
            }
        }

        int sum = (int)stack.pop();

        return sum;
    }


    public static void main(String[] args) {

        String s = "23*5+^";

        postFixCalculator pfc = new postFixCalculator();

        System.out.println(pfc.calculation(s));


    }



}

