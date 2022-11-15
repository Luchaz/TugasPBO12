package testlinkedliststack;

import java.util.LinkedList;

public class Stack {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();
        stack.push("tempat makan");
        stack.push("tempat saji");
        stack.push("tempat kecil");
        stack.push("tempat besar");
        System.out.println("Linked list: "+stack);
        System.out.println("Stack Size: "+stack.size());

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("Linked list:"+stack);
    }
}
