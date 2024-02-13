/**
 * A Main Class to test the content of GenericStack Class that got created according to the Exercise
 * 3. Write a generic stack class.
 * @author Bernhard Aichinger-Ganas
 * @version 13-02-24
 */
public class Main {
    public static void main(String[] args) {
        // Test integer stack
        System.out.println("------------------------------// Test integer stack //------------------------------\n");
        GenericStack<Integer> intStack = new GenericStack<>();

        // Push integers onto the stack
        System.out.println("\n--------------------// Push integers onto the stack //--------------------\n");
        try {
            intStack.push(5);
            intStack.push(10);
            intStack.push(15);
            intStack.push(20);
            intStack.push(25);
            intStack.push(30);
            intStack.push(35);
            intStack.push(40);
            intStack.push(45);
            intStack.push(50);
            intStack.push(55);
        } catch (StackFullException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--------------------// List integers from the stack //--------------------\n");
        try {
            System.out.println("Elements in the int stack: " + intStack.list());
        } catch (StackEmptyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n--------------------// Peek integer from the stack //--------------------\n");
        try {
            System.out.println("Top element: " + intStack.peek());
        } catch (StackEmptyException e) {
            System.out.println(e.getMessage());
        }

        // Pop integers from the stack
        System.out.println("\n--------------------// Pop integers from the stack //--------------------\n");
        try {
            System.out.println("Popped element: " + intStack.pop());
            System.out.println("Popped element: " + intStack.pop());
            System.out.println("Popped element: " + intStack.pop());
            try {
                System.out.println("Top element: " + intStack.peek());
            } catch (StackEmptyException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Popped element: " + intStack.pop());
            System.out.println("Popped element: " + intStack.pop());
            System.out.println("Popped element: " + intStack.pop());
            try {
                System.out.println("Top element: " + intStack.peek());
            } catch (StackEmptyException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Popped element: " + intStack.pop());
            System.out.println("Popped element: " + intStack.pop());
            System.out.println("Popped element: " + intStack.pop());
            System.out.println("Popped element: " + intStack.pop());
            System.out.println("Popped element: " + intStack.pop());
        } catch (StackEmptyException e) {
            System.out.println(e.getMessage());
        }

        // Test string stack
        System.out.println("\n------------------------------// Test string stack //------------------------------\n");
        GenericStack<String> stringStack = new GenericStack<>(3);

        // Push strings onto the stack
        System.out.println("\n--------------------// Push Strings onto the stack //--------------------\n");
        try {
            stringStack.push("Hello");
            stringStack.push("World");
            stringStack.push("Java");
            stringStack.push("To much");
        } catch (StackFullException e) {
            System.out.println(e.getMessage());
        }

        // List elements in the string stack
        System.out.println("\n--------------------// List Strings from the stack //--------------------\n");
        try {
            System.out.println("Elements in the string stack: " + stringStack.list());
        } catch (StackEmptyException e) {
            System.out.println(e.getMessage());
        }

        // Peek at the top element of the string stack
        System.out.println("\n--------------------// Peek Strings from the stack //--------------------\n");
        try {
            System.out.println("Top element: " + stringStack.peek());
        } catch (StackEmptyException e) {
            System.out.println(e.getMessage());
        }

        // Pop Strings from the stack
        System.out.println("\n--------------------// Pop Strings from the stack //--------------------\n");
        try {
            System.out.println("Popped element: " + stringStack.pop());
            System.out.println("Popped element: " + stringStack.pop());
            try {
                System.out.println("Top element: " + stringStack.peek());
            } catch (StackEmptyException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Popped element: " + stringStack.pop());
            System.out.println("Popped element: " + stringStack.pop());
        } catch (StackEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}