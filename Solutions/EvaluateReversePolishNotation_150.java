package Solutions;

import java.util.Stack;

//Medium problem
//
// You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
// Evaluate the expression. Return an integer that represents the value of the expression.
// Note that:
//  The valid operators are '+', '-', '*', and '/'.
//  Each operand may be an integer or another expression.
//  The division between two integers always truncates toward zero.
//  There will not be any division by zero.
//  The input represents a valid arithmetic expression in a reverse polish notation.
//  The answer and all the intermediate calculations can be represented in a 32-bit integer.

//Example 1:
// Input: tokens = ["2","1","+","3","*"]
// Output: 9
// Explanation: ((2 + 1) * 3) = 9

public class EvaluateReversePolishNotation_150 {
    public static String[] token1 = {"2","1","+","3","*"};
    public static String[] token2 = {"4","13","5","/","+"};
    public static String[] token3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

    public static int evalRPN(String[] tokens){
        Stack<String> temp1 = new Stack<String>();
        Stack<String> temp2 = new Stack<String>();
        String operation;
        int num1,num2;
        for (int i = tokens.length-1; i >= 0; i--) {
            temp1.push(tokens[i]);
        }
        while (!temp1.empty()){
            if (temp1.peek().equals("+") || temp1.peek().equals("-") || temp1.peek().equals("*") || temp1.peek().equals("/")){
                if (!temp2.empty()) {
                    num2 = Integer.parseInt(temp2.pop());
                    operation = temp1.pop();
                    num1 = Integer.parseInt(temp2.pop());
                    if (operation.equals("+")) temp1.push(String.valueOf(num1+num2));
                    else if (operation.equals("-")) temp1.push(String.valueOf(num1-num2));
                    else if (operation.equals("*")) temp1.push(String.valueOf(num1*num2));
                    else temp1.push(String.valueOf(num1/num2));
                }
            }
            else {
                temp2.push(temp1.pop());
            }
        }
        System.out.println(temp2.peek());
        return Integer.parseInt(temp2.pop());
    }

    public int evalRPNoptimal(String[] tokens){
        Stack<Integer> tempStack = new Stack<>();
        for (String i:tokens) {
            if ("+-*/".contains(i)){
                tempStack.push(calculate(tempStack.pop(),tempStack.pop(),i));
            }
            else tempStack.push(Integer.parseInt(i));
        }
        return tempStack.pop();
    }
    private int calculate(int b, int a, String op){
        if("+".equals(op))
            return a+b;
        else if("-".equals(op))
            return a-b;
        else if("*".equals(op))
            return a*b;
        else
            return a/b;
    }
}
