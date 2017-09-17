package com.aiqiyi.demo;

import java.util.Scanner;
import java.util.Stack;

public class Kuohao {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int depth = getDepth(str);
        System.out.println(depth);

    }
    public static int getDepth(String str) {
       int length=str.length();
    	if(length==0) {
            return 0;
        }
        Stack<Character> stack = new Stack<Character>();
        int max = 0;
        int index = 0;
        while(index < length) {
            if(str.charAt(index) == '(') {
                stack.push(str.charAt(index));
                index++;
            }else if(str.charAt(index) == ')') {
                max = Math.max(max, stack.size());
                stack.pop();
                index++;
            }
        }
        return max;
    }
}
