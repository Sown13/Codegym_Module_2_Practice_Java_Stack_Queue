package ex1;

import java.util.Arrays;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        int[] arrOfInteger = {2,3,4,5,6,10};
        Stack<Integer> tempStack = new Stack<>();
        for(int num : arrOfInteger){
            tempStack.push(num);
        }
//        int[] newArrReversed = new int[arrOfInteger.length];
        for (int i = 0; i< arrOfInteger.length; i++){
            arrOfInteger[i] = tempStack.pop();
        }
        System.out.println(Arrays.toString(arrOfInteger));

        String string = "Hello Anna";
        Stack<String> charStack = new Stack<>();
        for (String str : string.split("")){
            charStack.push(str);
        }
        String[] tempString = new String[string.length()];
        System.out.println(charStack);
        for(int i = 0; i < string.length(); i++){
            tempString[i] = charStack.pop();
        }
        System.out.println(String.join("",tempString));

    }
}
