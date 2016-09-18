package test;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        String str="(((520+480)*38/10)/2*((520+480)*38/10)/2)";
        boolean bool=isMatch(str);
        System.out.println(bool);

    }


        public static boolean isMatch(String s) {
            Stack<Character> sc = new Stack<Character>();
            char[] c = s.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (c[i] == '(' || c[i] == '[' || c[i] == '{') {
                    sc.push(c[i]);
                } else if (c[i] == ')') {
                    if (sc.isEmpty()) {
                        return false;
                    } else {
                        if (sc.peek() == '(') {
                            sc.pop();
                        }
                    }
                } else if (c[i] == '}') {
                    if (sc.isEmpty()) {
                        return false;
                    } else {
                        if (sc.peek() == '{') {
                            sc.pop();
                        }
                    }
                }
            }
            if (sc.empty()) {
                return true;
            } else {
                return false;
            }
        }



}
