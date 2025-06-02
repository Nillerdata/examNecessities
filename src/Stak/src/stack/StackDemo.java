package Stak.src.stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
//        StackI<String> s = new NodeStack();
//         StackI<String> s = new ArrayStack(5);
        StackI<String> s = new ArraylistStack<>();
        s.push("Tom");
        s.push("Diana");
        s.push("Harry");
        s.push("Thomas");
        s.push("Bob");
        s.push("Brian");
        System.out.println(s.peek());


        System.out.println(s.isEmpty() + " " + s.size());
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
        System.out.println();
        System.out.println(s.isEmpty() + " " + s.size());
        System.out.println();

        System.out.println(checkParantes("(3+{5{99{*}}[23[{67}67]]})")); // true
        System.out.println(checkParantes("(}){"));                       // false
        System.out.println(checkParantes("()[]{}"));                     // true
        System.out.println(checkParantes("([)]")); // false
        System.out.println(checkParantes("()")); //true
        System.out.println(checkParantes("("));

        // -------- test af reverse --------

//        Integer[] tal = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        reverse(tal);
//        for (int i = 0; i < tal.length; i++) {
//            System.out.print(tal[i] + " ");
        //       }
    }

    public static <E> void reverse(E[] tabel) {
        StackI<E> stack = new ArrayStack(tabel.length);
        // StackI stack = new NodeStack();
        for (int i = 0; i < tabel.length; i++) {
            stack.push(tabel[i]);
        }
        int i = 0;
        while (!stack.isEmpty()) {
            tabel[i] = stack.pop();
            i++;
        }

    }

    public static boolean checkParantes(String s) {
        boolean works = true;

        StackI<Character> stack = new ArraylistStack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    works = false;
                    return works;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    works = false;
                }
            }
            if (stack.isEmpty()) {
                works = false;
            }
        }

        return works;
    }
}
