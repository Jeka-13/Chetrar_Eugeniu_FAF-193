package com.jeka.lab4;

import java.util.Scanner;
import java.util.Stack;

public class Algorithm{

    public void start(String expression){
        int counter=0;
        for(int i=0; i<expression.length(); i++){
            char symbol = expression.charAt(i);
            if(symbol=='(') counter++;
            if(symbol==')') counter--;
        }
        if(counter!=0) System.out.println("We cannot resolve this equation, because it has a mistake");
        else calculation(expression);
    }

    private void calculation(String expression){
        String prepared = preparingExpression(expression);
        String rpn = expressionToRpn(prepared);
        System.out.println(rpnToAnswer(rpn));
    }

    private String preparingExpression(String expression){ ;
        String preparedExpression = new String();
        double a, b;
        double result1, result2;
        for (int token = 0; token<expression.length(); token++){
            char symbol = expression.charAt(token);
            if(symbol=='-') {
                if(token==0){preparedExpression+='0';}
                else if(expression.charAt(token-1)=='('){preparedExpression+='0';}
            }
                if (expression.charAt(token) == 'x' || expression.charAt(token) == 'y') {
                    if (symbol == 'x') {
                        System.out.println("Introduce the value of x");
                        Scanner in = new Scanner(System.in);
                        a = in.nextInt();
                        result1 = Character.getNumericValue(expression.charAt(token-1))*a;
                        preparedExpression.replace(expression.charAt(token-1), (char) result1);
                        continue;
                    }
                    if (symbol == 'y') {
                        System.out.println("Introduce the value of y");
                        Scanner in = new Scanner(System.in);
                        b = in.nextInt();
                        result2 = Character.getNumericValue(expression.charAt(token-1))*b;
                        preparedExpression.replace(expression.charAt(token-1), (char) result2);
                        continue;
                    }
                }
            preparedExpression += symbol;
        }
        return preparedExpression;
    }

    private String expressionToRpn(String expression){
        String current = "";
        Stack<Character> stack = new Stack<>();

        int priority;
        for (int i=0; i<expression.length(); i++){
            priority = getPriority(expression.charAt(i));

            if(priority==0){current+=expression.charAt(i);}
            if(priority==1){stack.push(expression.charAt(i));}

            if(priority>1){
                current+=' ';

                while (!stack.empty()) {
                    if (getPriority(stack.peek()) >= priority) {
                        current += stack.pop();
                    } else break;
                }

                stack.push(expression.charAt(i));
            }
            if(priority==-1){
                current +=' ';
                while (getPriority(stack.peek())!= 1){current += stack.pop();}

                stack.pop();
            }
        }
        while (!stack.empty()){
            current+=stack.pop();
        }
    return current;
    }

    private  double rpnToAnswer(String rpn){
        String operand = new String();
        Stack<Double> stack = new Stack<>();

        for(int i=0; i<rpn.length(); i++){
            if(rpn.charAt(i) == ' '){continue;}

            if(getPriority((rpn.charAt(i))) == 0){
                while(rpn.charAt(i)!=' ' && getPriority(rpn.charAt(i))==0){
                    operand+=rpn.charAt(i++);
                    if(i == rpn.length()); break;
                }
                stack.push(Double.parseDouble(operand));
                operand = new String();
            }
            if(getPriority(rpn.charAt(i))>1){
                double a = stack.pop(), b = stack.pop();

                if(rpn.charAt(i) == '+'){stack.push(b+a);}
                if(rpn.charAt(i) == '-'){stack.push(b-a);}
                if(rpn.charAt(i) == '*'){stack.push(b*a);}
                if(rpn.charAt(i) == '/'){stack.push(b/a);}
            }
        }
        return stack.pop();
    }

    private  int getPriority(char token){
        if(token=='*' || token=='/') {return 3;}
        else if(token=='+' || token=='-') {return 2;}
        else if(token=='(') {return 1;}
        else if(token==')') {return -1;}
        else {return 0;}
    }
}


