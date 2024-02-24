package ru.itis.homework_for_24febr;



public class Main {
    public static void main(String[] args) throws EmptyElementException, SameElementException {
        Set<String> set = new Set<>();
        set.add("5");
        set.add("6");
        System.out.println(set.contains("0"));
        for (int i = 0; i < set.getSize(); i++) {
            System.out.print(set.asList()[i] + ", ");
        }
        System.out.println();
        Stack<Integer> stack = new Stack<>();
        stack.push(6);
        stack.push(8);
        stack.push(2);
        System.out.println(stack.pop());


    }
}
