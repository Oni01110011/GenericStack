/**
 * Exception that gets thrown when the Stack is full
 * @author Bernhard Aichinger-Ganas
 * @version 13-02-23
 */
public class StackFullException extends Exception{
    public StackFullException() {
        super("Sadly the Stack is full, use the pop Method to delete the last Element");
    }
}
