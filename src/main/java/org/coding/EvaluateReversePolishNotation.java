package org.coding;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] token =new String[]{"2","1","+","4","*"};
        System.out.println(evalRPN(token));
    }
    private static int evalRPN(String[] token) {
        int returnValue=0;
        String operators="+-*/";

        Stack<String> stack= new Stack<>();
        for(String t: token){
            if(!operators.contains(t)){
                stack.push(t);
            }
            else{
                int a= Integer.valueOf(stack.pop());
                int b= Integer.valueOf(stack.pop());
                switch (t){
                    case "+":
                        stack.push(String.valueOf(a+b));
                        break;
                    case "-":
                        stack.push(String.valueOf(a-b));
                        break;
                    case "*":
                        stack.push(String.valueOf(a*b));
                        break;
                    case "/":
                        stack.push(String.valueOf(a/b));
                        break;
                }
            }
        }
        returnValue=Integer.valueOf(stack.pop());
        return returnValue;
    }
}
